package com.deepexi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubboConfiguration
@EnableHystrix
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }
}
