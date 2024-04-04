package gr.codehub.repository;

import gr.codehub.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductRepositoryInterface {
    private ArrayList<Product> products = new ArrayList<>();
    private int productCount = 0;

    @Override
    public int create(Product product){
        product.setId(productCount);
        productCount++;
        products.add(product);
        return productCount;
    }

    @Override
    public List<Product> readAll(){
        return products;
    }

    @Override
    public Product readById(int id){
        for (Product product: products)
            if (product.getId()==id){
                return product;
            }

        return null;
    }

    @Override
    public boolean update(int id, BigDecimal newPrice){
        Product product = readById(id);
        if (product != null){
            product.setPrice(newPrice);
            return true;
        }
        return false;
     }

    @Override
    public boolean delete(int id){
        Product product = readById(id);
        if (product != null){
            products.remove(product);
            return true;
        }
        return false;
    }
}
