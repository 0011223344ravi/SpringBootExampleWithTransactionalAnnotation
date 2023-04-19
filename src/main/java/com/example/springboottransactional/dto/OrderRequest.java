package com.example.springboottransactional.dto;

import com.example.springboottransactional.entity.OrderInfo;
import com.example.springboottransactional.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

     private OrderInfo  orderInfo ;
     private PaymentInfo paymentInfo ;
}
