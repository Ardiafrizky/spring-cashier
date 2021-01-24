package com.blibli.demo.backend.model.responses;

import java.util.ArrayList;

import com.blibli.demo.backend.model.entities.Order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderListProducer {
    private ArrayList<Order> orderList;
}
