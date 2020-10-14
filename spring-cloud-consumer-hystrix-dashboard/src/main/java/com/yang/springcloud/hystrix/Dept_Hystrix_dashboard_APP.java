package com.yang.springcloud.hystrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Dept_Hystrix_dashboard_APP {
    public static void main(String[] args)
    {
        SpringApplication.run(Dept_Hystrix_dashboard_APP.class,args);
    }

}
