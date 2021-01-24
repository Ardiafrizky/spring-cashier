package com.blibli.demo.backend.service.impl;

import java.util.ArrayList;
import java.util.Comparator;

import com.blibli.demo.backend.model.entities.Customer;
import com.blibli.demo.backend.model.entities.Order;
import com.blibli.demo.backend.model.entities.OrderItems;
import com.blibli.demo.backend.model.requests.OrderConsumer;
import com.blibli.demo.backend.model.requests.OrderItemConsumer;
import com.blibli.demo.backend.model.responses.OrderListProducer;
import com.blibli.demo.backend.service.CashierService;

import org.springframework.stereotype.Service;

@Service
public class CashierServiceImpl implements CashierService{
    ArrayList<Order> orders = new ArrayList<>();
    int orderId = 0;

    @Override
    public Order addOrder(OrderConsumer newOrder) {
        ArrayList<OrderItems> orderList = new ArrayList<>();

        int totalPrice = 0;
        int orderItemId = 0;
        for(OrderItemConsumer newOrderItem : newOrder.getOrderItems()){
            OrderItems orderItems = OrderItems
                    .builder()
                    .id(orderItemId++)
                    .name(newOrderItem.getProductName())
                    .price(newOrderItem.getPrice())
                    .quantity(newOrderItem.getQuantity())
                    .build();
            orderList.add(orderItems);
            totalPrice += orderItems.getPrice()*orderItems.getQuantity();
        }
        Customer customer = Customer    
                .builder()
                .name(newOrder.getCustomer().getName())
                .email(newOrder.getCustomer().getEmail())
                .build();

        Order order = Order
                .builder()
                .id(orderId++)
                .totalPrice(totalPrice)
                .customer(customer)
                .orderItems(orderList)
                .build();
        orders.add(order);
        return order;
    }

    @Override
    public Order getOrderById(int id) {
        for(Order order : orders){
            if(order.getId()==id){
                return order;
            }
        }
        return null;
    }

    @Override
    public OrderListProducer getOrdersByName(){
        ArrayList<Order> orderListResponse = new ArrayList<>(orders);
        orderListResponse.sort(Comparator.comparing(a -> a.getCustomer().getName()));
        return new OrderListProducer(orderListResponse);
    }

    @Override
    public OrderListProducer getOrdersByPrice(){
        ArrayList<Order> orderListResponse = new ArrayList<>(orders);
        orderListResponse.sort((a, b) -> b.getTotalPrice() - a.getTotalPrice());
        return new OrderListProducer(orderListResponse);
    }
}
