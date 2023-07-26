package com.example.condition.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * ClassName: ClassCondition
 * Package: com.example.condition.condition
 * Description:
 *
 * @Author px
 * @Create 2023/7/26 8:15 下午
 * @Version 1.0
 */
public class ClassCondition implements Condition {

    /**
     *
     * @param context 上下文对象，用于获取环境，IOC容器，ClassLoader对象
     * @param metadata 注解元对象，用于获取注解定义的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        boolean flag = true;
//        try {
//            Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            flag = false;
//        }
//
//        return flag;

        boolean flag = true;

        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String [] values = (String[])map.get("value");
        try {
            for (String className:values) {
                Class<?> clazz = Class.forName(className);
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }

        return flag;
    }
}
