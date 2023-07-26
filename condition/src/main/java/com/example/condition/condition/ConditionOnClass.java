package com.example.condition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * ClassName: ConditionOnClass
 * Package: com.example.condition.condition
 * Description:
 *
 * @Author px
 * @Create 2023/7/26 9:29 下午
 * @Version 1.0
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {
    String [] value();
}
