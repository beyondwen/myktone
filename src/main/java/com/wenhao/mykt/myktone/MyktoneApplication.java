package com.wenhao.mykt.myktone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wenhao.mykt.myktone.mapper")
public class MyktoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyktoneApplication.class, args);
    }

}
