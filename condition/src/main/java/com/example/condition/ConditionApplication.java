package com.example.condition;

import com.example.condition.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConditionApplication {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConditionApplication.class, args);

        User user = context.getBean(User.class);
        System.out.println(user);

    }

}
