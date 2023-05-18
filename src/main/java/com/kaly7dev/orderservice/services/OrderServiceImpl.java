package com.kaly7dev.orderservice.services;

import com.kaly7dev.orderservice.dtos.OrderRequest;
import com.kaly7dev.orderservice.repositories.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;
    @Override
    public String placeOrder(OrderRequest orderRequest) {
        return null;
    }
}
