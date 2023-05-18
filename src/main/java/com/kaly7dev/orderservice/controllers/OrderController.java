package com.kaly7dev.orderservice.controllers;

import java.util.List;
import com.kaly7dev.orderservice.dtos.*;
import java.util.concurrent.CompletableFuture;

public interface OrderController {
    CompletableFuture<String> placeOrder( OrderRequest orderRequest);
    CompletableFuture<List<OrderResponse>> orderList();
}
