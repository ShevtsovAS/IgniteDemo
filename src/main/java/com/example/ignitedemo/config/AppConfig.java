package com.example.ignitedemo.config;

import org.apache.ignite.springframework.boot.autoconfigure.IgniteConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public IgniteConfiguration igniteConfiguration() {
//        // If you provide a whole ClientConfiguration bean then configuration properties will not be used.
//        IgniteConfiguration cfg = new IgniteConfiguration();
//        cfg.setIgniteInstanceName("my-ignite");
//        return cfg;
//    }

    @Bean
    public IgniteConfigurer nodeConfigurer() {
        //Setting some property.
        //Other will come from `application.yml`
        return cfg -> {
            cfg.setConsistentId("consistent-id");
            cfg.setIgniteInstanceName("my-ignite");
        };
    }

}
