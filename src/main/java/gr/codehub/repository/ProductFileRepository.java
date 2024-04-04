package gr.codehub.repository;

import gr.codehub.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFileRepository implements ProductRepositoryInterface{
    private final String filename="data/data.csv";
    public int count = 0;
    @Override
    public int create(Product product) {
        try {
            PrintWriter pw = new PrintWriter(filename);
            product.setId(count);
            count++;
            pw.println(product.getId()+","+product.getName()+","+product.getPrice());
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    @Override
    public List<Product> readAll() {
        List<Product> products = new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] items = line.split(",");
                Product product = new Product();
                product.setId(Integer.parseInt(items[0]));
                product.setName(items[1]);
      if  (!items[2].equals("null"))        product.setPrice(new BigDecimal(items[2]));
                products.add(product);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public Product readById(int id) {
        return null;
    }

    @Override
    public boolean update(int id, BigDecimal newPrice) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
