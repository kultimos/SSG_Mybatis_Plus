package com.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.data.mapper")
public class MybatisPlusDatasourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDatasourceApplication.class, args);
    }
}
