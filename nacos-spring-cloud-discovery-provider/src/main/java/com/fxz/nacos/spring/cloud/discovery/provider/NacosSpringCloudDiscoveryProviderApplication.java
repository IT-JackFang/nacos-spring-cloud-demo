package com.fxz.nacos.spring.cloud.discovery.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSpringCloudDiscoveryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringCloudDiscoveryProviderApplication.class, args);
    }

}
