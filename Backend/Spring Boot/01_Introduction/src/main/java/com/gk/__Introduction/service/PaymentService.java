package com.gk.__Introduction.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Service
public class PaymentService {

    public void pay() {
        System.out.println("Payment is in progress");
    }

    @PostConstruct
    public void init() {
        System.out.println("App Config initialized");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Cleaning resources");
    }
}
