package gr.codehub.model;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private Product product;
}
