package com.alpctr.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCod, BigDecimal price, Integer quantity) {
}
