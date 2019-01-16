package com.rayyu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot引导类，启动类
 * 需要在类上添加@SpringBootApplication注解
 * @author Alphonso
 */
@SpringBootApplication
public class MySpringBootApplication {

    /**
     * 使用SpringApplication.run(参数为引导类.class)
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
