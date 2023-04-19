package com.example.springboottransactional.dto;

import com.example.springboottransactional.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderAck {

    private String status;
    private double totalFare;
    private PaymentInfo paymentInfo;
}
