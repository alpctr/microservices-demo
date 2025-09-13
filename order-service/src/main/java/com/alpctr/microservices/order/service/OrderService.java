package com.alpctr.microservices.order.service;

import com.alpctr.microservices.order.dto.OrderRequest;
import com.alpctr.microservices.order.model.Order;
import com.alpctr.microservices.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCod());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);

    }
}
