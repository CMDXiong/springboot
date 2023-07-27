package com.example.listener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: MyCommandLineRunner
 * Package: com.example.listener.listener
 * Description:
 *
 * @Author px
 * @Create 2023/7/27 8:53 上午
 * @Version 1.0
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner: " + Arrays.asList(args).toString());
    }
}
