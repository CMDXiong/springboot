package com.example.listener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyApplicationContextInitializer
 * Package: com.example.listener.listener
 * Description:
 *
 * @Author px
 * @Create 2023/7/27 8:51 上午
 * @Version 1.0
 */

@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer: initialize");
    }
}
