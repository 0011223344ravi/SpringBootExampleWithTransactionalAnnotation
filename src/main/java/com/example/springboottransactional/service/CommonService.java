package com.example.springboottransactional.service;

import com.example.springboottransactional.dto.OrderAck;
import com.example.springboottransactional.dto.OrderRequest;
import com.example.springboottransactional.entity.OrderInfo;
import com.example.springboottransactional.entity.PaymentInfo;
import com.example.springboottransactional.repo.OrderRepo;
import com.example.springboottransactional.repo.PaymentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.springboottransactional.util.CommonUtil.validateCreditLimit;

@Service
public class CommonService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private OrderRepo orderRepo;
@Transactional
    public OrderAck orderAck(OrderRequest orderRequest){

        OrderInfo   orderInfo =  orderRequest.getOrderInfo();
        orderInfo = orderRepo.save(orderInfo);

        PaymentInfo paymentInfo = orderRequest.getPaymentInfo();

        validateCreditLimit(paymentInfo.getId() , paymentInfo.getAmount());

        orderInfo.setPaymentId(paymentInfo.getId());
        orderInfo= orderRepo.save(orderInfo);
       paymentInfo = paymentRepo.save(paymentInfo);



         return new OrderAck("Success" ,paymentInfo.getAmount(),paymentInfo);
    }
}
