package com.blibli.demo.backend.model.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItems {
    private String name;
    private int id;
    private int price;
    private int quantity;

    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public Long getId() {
    //     return this.id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public Long getPrice() {
    //     return this.price;
    // }

    // public void setPrice(Long price) {
    //     this.price = price;
    // }

    // public Long getQuantity() {
    //     return this.quantity;
    // }

    // public void setQuantity(Long quantity) {
    //     this.quantity = quantity;
    // }
}
