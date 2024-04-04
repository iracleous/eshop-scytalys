package gr.codehub.repository;

import gr.codehub.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepositoryInterface {
    int create(Product product);

    List<Product> readAll();

    Product readById(int id);

    boolean update(int id, BigDecimal newPrice);

    boolean delete(int id);
}
