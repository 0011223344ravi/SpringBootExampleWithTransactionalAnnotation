package com.example.springboottransactional.repo;

import com.example.springboottransactional.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderInfo, Integer> {
}
