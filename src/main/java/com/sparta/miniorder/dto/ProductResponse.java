package com.sparta.miniorder.dto;

import com.sparta.miniorder.entity.Product;
import lombok.Getter;

@Getter
public class ProductResponse {

    private final Long id;
    private final String name;
    private final Integer price;

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }

}
