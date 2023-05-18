package com.kaly7dev.orderservice.dtos;

import com.kaly7dev.orderservice.entities.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long orderId;
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
