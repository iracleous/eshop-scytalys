package gr.codehub.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private BigDecimal weight;
}
