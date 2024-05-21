package com.example.inventory_service.controller;

import com.example.inventory_service.model.entities.dtos.BaseResponse;
import com.example.inventory_service.model.entities.dtos.OrderItemRequest;
import com.example.inventory_service.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping("/{sku}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isIStock(@PathVariable("sku") String sku){
        return inventoryService.isInStock(sku);
    }
    @PostMapping("/in-stock")
    @ResponseStatus(HttpStatus.OK)
    public BaseResponse areinStock(@RequestBody List<OrderItemRequest> orderItems){
        return inventoryService.areInStock(orderItems);
    }
}
