package com.itLearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhaowei on 2019/5/8.
 */

@SpringBootApplication
@MapperScan("com.itLearn.mapper")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
