package com.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationApplication {

    @Value("${name}")
    private String name;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationApplication.class, args);
    }

    @RequestMapping("/config")
    public String config(){
        System.out.println(this.name);
        System.out.println("--------------");
        System.out.println(env.getProperty("name"));
        System.out.println(env.getProperty("address[0]"));
        System.out.println("--------------");
        System.out.println(person);

        return "springboot configuration";
    }
}
