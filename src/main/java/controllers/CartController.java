package controllers;

import model.Cart;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/{id}")
    public RedirectView addToCart(@PathVariable("id") Long id,
                                  @RequestParam("quantity") int quantity,
                                  @SessionAttribute(name = "cartMap") Map<Product, Cart> cartMap) {
        Product product = HomeController.productMap.get(id);
        Cart cart = new Cart();
        cart.setProduct(product);
        cart.setPrice(product.getPrice());
        cart.setQuantity(quantity);
        cartMap.put(product, cart);
        return new RedirectView("/");
    }

    @GetMapping()
    public ModelAndView showCart(@SessionAttribute(name = "cartMap") Map<Product, Cart> cartMap) {
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("cartMap", cartMap);
        return modelAndView;
    }
}
