package com.alpctr.microservices.order.event;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderPlacedEvent {
    private String firstName;
    private String lastName;
    private String orderNumber;
    private String email;
}
