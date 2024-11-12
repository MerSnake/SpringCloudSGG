package com.edu.whu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yqx
 * @since 2024/6/21
 */
@SpringBootApplication
@EnableFeignClients
public class MainFeigin80 {
    public static void main(String[] args) {
        SpringApplication.run(MainFeigin80.class, args);
    }
}