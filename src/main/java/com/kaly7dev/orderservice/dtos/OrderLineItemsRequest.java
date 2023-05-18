package com.kaly7dev.orderservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsRequest {
    private Long lineId;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
