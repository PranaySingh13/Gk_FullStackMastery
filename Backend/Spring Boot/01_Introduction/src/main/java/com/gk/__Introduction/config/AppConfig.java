package com.gk.__Introduction.config;

import com.gk.__Introduction.service.PaymentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CommandLineRunner runner(PaymentService paymentService) {
        return args -> {
            paymentService.pay();
        };
    }
}
