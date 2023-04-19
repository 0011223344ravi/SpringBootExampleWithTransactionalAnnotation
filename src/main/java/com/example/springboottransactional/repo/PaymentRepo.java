package com.example.springboottransactional.repo;

import com.example.springboottransactional.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository< PaymentInfo, Long> {

}
