package com.jianz.JavaEEManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/1/30 21:50
 */
@SpringBootApplication
@EnableScheduling
public class FrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class,args);
    }
}
