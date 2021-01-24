package com.blibli.demo.backend.controller;

import java.util.Optional;

import com.blibli.demo.backend.model.entities.Order;
import com.blibli.demo.backend.model.requests.OrderConsumer;
import com.blibli.demo.backend.model.responses.OrderListProducer;
import com.blibli.demo.backend.service.impl.CashierServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private CashierServiceImpl cashierService;

    @PostMapping(value="/order")
    private void postOrder(@RequestBody OrderConsumer newOrder){
        cashierService.addOrder(newOrder);
    }

    @GetMapping(value="/order")
    private OrderListProducer retrieveOrder(
            @RequestParam(value = "orderByPrice", defaultValue = "false") Optional<Boolean> byPrice,
            @RequestParam(value = "orderByCustomer", defaultValue = "false") Optional<Boolean> byName
    ) {
        if(byPrice.get()) return cashierService.getOrdersByPrice();
        else return cashierService.getOrdersByName();
    }

    @GetMapping(value="/order/{id}")
    private Order getOrderbyId(
            @PathVariable int id
    ){
        return cashierService.getOrderById(id);
    }
}
