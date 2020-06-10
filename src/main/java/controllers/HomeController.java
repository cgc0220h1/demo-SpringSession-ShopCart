package controllers;

import model.Cart;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
@SessionAttributes({"cartMap", "products"})
public class HomeController {
    public static final Map<Long, Product> productMap;

    public static Map<Product, Cart> cartMap;

    static {
        productMap = new LinkedHashMap<>();
        productMap.put(1L, new Product(1L, "Áo Nai Kì", "Kì đi kì lại cho sạch", "/images/cloth_1.jpg", 50));
        productMap.put(2L, new Product(2L, "Giày Gu Chì", "Gu chì không phải gu xì", "/images/shoe_1.jpg", 30));
        productMap.put(3L, new Product(3L, "Áo Polo", "Mặc mát vãi", "/images/cloth_2.jpg", 20));
        productMap.put(4L, new Product(4L, "Áo Adidas", "Mặc là phải chát", "/images/cloth_3.jpg", 45));
        productMap.put(5L, new Product(5L, "Áo Si đa", "Mặc là bị si đa", "/images/cloth_1.jpg", 35));
        productMap.put(6L, new Product(6L, "Giầy hút pùn", "Giày chất vl nha", "/images/cloth_2.jpg", 90));
    }

    @ModelAttribute("products")
    public Map<Long, Product> initProducts() {
        return productMap;
    }

    @ModelAttribute("cartMap")
    public Map<Product, Cart> initCartMap() {
        cartMap = new LinkedHashMap<>();
        return cartMap;
    }

    @GetMapping
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


}
