package model;

import java.util.Collection;
import java.util.LinkedList;

public class Product {
    private Long id;

    private String name;

    private String description;

    private String imageLink;

    private int price;

    private Collection<Cart> carts;

    public Product() {
        carts = new LinkedList<>();
    }

    public Product(Long id, String name, String description, String imageLink, int price) {
        carts = new LinkedList<>();
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageLink = imageLink;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Collection<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Collection<Cart> carts) {
        this.carts = carts;
    }
}
