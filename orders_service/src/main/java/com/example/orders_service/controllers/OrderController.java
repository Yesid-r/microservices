package com.example.orders_service.controllers;

import com.example.orders_service.model.dtos.OrderRequest;
import com.example.orders_service.model.dtos.OrderResponse;
import com.example.orders_service.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        this.orderService.placeOrder(orderRequest);
        return "order placed successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> geOrders(){
        return this.orderService.getAllOrders();
    }
}
