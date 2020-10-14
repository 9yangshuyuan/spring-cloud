package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GeteWay_9527_App {
    public static void main(String[] args) {
        SpringApplication.run(GeteWay_9527_App.class, args);
    }
}
