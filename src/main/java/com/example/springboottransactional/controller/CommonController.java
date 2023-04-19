package com.example.springboottransactional.controller;

import com.example.springboottransactional.dto.OrderAck;
import com.example.springboottransactional.dto.OrderRequest;
import com.example.springboottransactional.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommonController {

    @Autowired
    private CommonService   commonService;

    @PostMapping("/order")
    public OrderAck orderAck (@RequestBody OrderRequest  orderRequest){

        return commonService.orderAck(orderRequest);

    }
}
