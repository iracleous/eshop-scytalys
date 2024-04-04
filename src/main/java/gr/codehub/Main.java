package gr.codehub;

import gr.codehub.model.Customer;
import gr.codehub.model.Product;
import gr.codehub.repository.ProductRepository;
import gr.codehub.repository.ProductRepositoryInterface;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product();
        product.setId(7);
        System.out.println(product.getId());
        Customer customer = new Customer();
        product.setCustomer(customer);
        customer.setProduct(product);

        ProductRepositoryInterface productRepository = new ProductRepository();
        productRepository.create(product);
        System.out.println(productRepository.readAll());

        System.out.println(productRepository.readById(0).getName());
        productRepository.update(0, new BigDecimal("1.2"));
        System.out.println(productRepository.readById(0).getPrice());
        productRepository.delete(0);
        System.out.println(productRepository.readAll());

        Product anotherProduct = productRepository.readById(7);
        if (anotherProduct==null) return;
        anotherProduct.setPrice(new BigDecimal("2"));
        System.out.println(anotherProduct.getPrice());
    }
}