package com.kaly7dev.orderservice.services;

import com.kaly7dev.orderservice.dtos.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}
