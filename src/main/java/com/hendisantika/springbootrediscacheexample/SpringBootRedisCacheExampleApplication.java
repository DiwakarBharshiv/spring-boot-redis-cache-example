package com.hendisantika.springbootrediscacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SpringBootRedisCacheExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisCacheExampleApplication.class, args);
    }

}
