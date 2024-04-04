package gr.codehub.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Data
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private BigDecimal weight;
    private Customer customer;
}
