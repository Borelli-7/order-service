package com.kaly7dev.orderservice.controllers;

import com.kaly7dev.orderservice.dtos.OrderRequest;
import com.kaly7dev.orderservice.dtos.OrderResponse;

import com.kaly7dev.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderRestControllerImpl implements OrderController {

    private OrderService orderService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompletableFuture<String> placeOrder(@RequestBody OrderRequest orderRequest) {
        return CompletableFuture.supplyAsync(() ->orderService.placeOrder(orderRequest));
    }

    @Override
    @GetMapping("lists")
    @ResponseStatus(HttpStatus.OK)
    public CompletableFuture<List<OrderResponse>> orderList() {
        return null;
    }
}
