package com.atguigu.crowd;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 扫描MyBatis的Mapper接口所在的包
@MapperScan("com.atguigu.crowd.mapper")
@EnableFeignClients(basePackages = {"com.codingapi.tx"})
@SpringBootApplication
public class CrowdMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMainClass.class,args);
    }
}
