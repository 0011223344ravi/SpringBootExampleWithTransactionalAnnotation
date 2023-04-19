package com.example.springboottransactional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "payment")
@Entity
public class PaymentInfo {
    @Id
    private Long id ;

    private double amount ;
}
