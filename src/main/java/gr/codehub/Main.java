package gr.codehub;

import gr.codehub.model.Customer;
import gr.codehub.model.Product;
import gr.codehub.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product();
        product.setId(7);
        System.out.println(product.getId());
        Customer customer = new Customer();
        product.setCustomer(customer);
        customer.setProduct(product);

        ProductRepository productRepository = new ProductRepository();
        productRepository.create(product);
        System.out.println(productRepository.readAll());

    }
}