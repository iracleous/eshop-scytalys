package gr.codehub;

import gr.codehub.model.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product();
        product.setId(7);
        System.out.println(product.getId());

    }
}