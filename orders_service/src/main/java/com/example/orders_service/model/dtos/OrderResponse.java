package com.example.orders_service.model.dtos;

import com.example.orders_service.model.entities.OrderItems;

import java.util.List;

public record OrderResponse (Long id, String orderNumber, List<OrderItemsResponse> orderItems) {
}
