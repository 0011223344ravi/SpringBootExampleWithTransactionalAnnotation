package com.example.springboottransactional.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ordertb")
@Entity
public class OrderInfo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id ;
  private String orderName;
  private Long paymentId;
}
