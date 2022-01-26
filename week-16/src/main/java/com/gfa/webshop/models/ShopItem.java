package com.gfa.webshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ShopItem {

    private String name;
    private String description;
    private int price;
    private int stockQuantity;


}
