package com.example.listener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: MyApplicationRunner
 * Package: com.example.listener.listener
 * Description:
 *
 * @Author px
 * @Create 2023/7/27 8:53 上午
 * @Version 1.0
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner: "+Arrays.asList(args.getSourceArgs()));
    }
}
