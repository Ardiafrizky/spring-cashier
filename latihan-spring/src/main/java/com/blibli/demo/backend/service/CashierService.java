package com.blibli.demo.backend.service;

import com.blibli.demo.backend.model.entities.Order;
import com.blibli.demo.backend.model.requests.OrderConsumer;
import com.blibli.demo.backend.model.responses.OrderListProducer;

public interface CashierService {
    public OrderListProducer getOrdersByName();
    public OrderListProducer getOrdersByPrice();
    public Order getOrderById(int id);
    public Order addOrder(OrderConsumer order);
}
