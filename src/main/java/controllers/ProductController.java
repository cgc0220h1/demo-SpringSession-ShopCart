package controllers;

import model.Cart;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
@SessionAttributes({"cartMap", "products"})
public class ProductController {

    @GetMapping("/{id}")
    public ModelAndView showDetail(@PathVariable("id") Long id,
                                   @SessionAttribute(name = "cartMap") Map<Product, Cart> cartMap,
                                   @SessionAttribute(name = "products") List<Product> products) {
        ModelAndView modelAndView = new ModelAndView("shop-single");
        Product product = HomeController.productMap.get(id);
        modelAndView.addObject("product", product);
        modelAndView.addObject("products", products);
        modelAndView.addObject("cartMap", cartMap);
        return modelAndView;
    }
}
