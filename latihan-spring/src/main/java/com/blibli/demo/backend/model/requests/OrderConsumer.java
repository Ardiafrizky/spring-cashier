package com.blibli.demo.backend.model.requests;

import java.util.ArrayList;
import java.util.List;

import com.blibli.demo.backend.model.entities.Customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderConsumer {
    private Customer customer;
    private List<OrderItemConsumer> orderItems;

    // public Customer getCustomer() {
    //     return this.customer;
    // }

    // public void setCustomer(Customer customer) {
    //     this.customer = customer;
    // }

    // public ArrayList<OrderItemConsumer> getOrderItems() {
    //     return this.orderItems;
    // }

    // public void setOrderItems(ArrayList<OrderItemConsumer> orderItems) {
    //     this.orderItems = orderItems;
    // }
}
