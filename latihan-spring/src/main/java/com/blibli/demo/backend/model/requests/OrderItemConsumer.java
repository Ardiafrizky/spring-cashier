package com.blibli.demo.backend.model.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItemConsumer {
    private int price;
    private int quantity;
    private String productName;

    // public int getPrice() {
    //     return this.price;
    // }

    // public void setPrice(int price) {
    //     this.price = price;
    // }

    // public int getQuantity() {
    //     return this.quantity;
    // }

    // public void setQuantity(int quantity) {
    //     this.quantity = quantity;
    // }

    // public String getProductName() {
    //     return this.productName;
    // }

    // public void setProductName(String productName) {
    //     this.productName = productName;
    // }
}
