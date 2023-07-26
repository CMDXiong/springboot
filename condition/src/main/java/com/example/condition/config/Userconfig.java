package com.example.condition.config;

import com.example.condition.condition.ClassCondition;
import com.example.condition.condition.ConditionOnClass;
import com.example.condition.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Userconfig
 * Package: com.example.condition.config
 * Description:
 *
 * @Author px
 * @Create 2023/7/26 8:17 下午
 * @Version 1.0
 */

@Configuration
public class Userconfig {
//      第一种方式
//    @Bean
//    @Conditional(ClassCondition.class)
//    public User user(){
//        return new User();
//    }

    @Bean
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }

//    @Bean
//    @ConditionalOnProperty(name = "px", havingValue = "handsome")
//    public User user2(){
//        return new User();
//    }
}
