package com.blibli.demo.backend.model.entities;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private int id;
    private int totalPrice;
    private Customer customer;
    private ArrayList<OrderItems> orderItems;

    // public Long getId() {
    //     return this.id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public Long getTotalPrice() {
    //     return this.totalPrice;
    // }

    // public void setTotalPrice(Long totalPrice) {
    //     this.totalPrice = totalPrice;
    // }

    // public Customer getCustomer() {
    //     return this.customer;
    // }

    // public void setCustomer(Customer customer) {
    //     this.customer = customer;
    // }

    // public ArrayList<OrderItems> getOrderItems() {
    //     return this.orderItems;
    // }

    // public void setOrderItems(ArrayList<OrderItems> orderItems) {
    //     this.orderItems = orderItems;
    // }
}
