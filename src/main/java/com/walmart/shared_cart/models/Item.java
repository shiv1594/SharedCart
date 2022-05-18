package com.walmart.shared_cart.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private String productName;

    private double price;

    private String description;
}
