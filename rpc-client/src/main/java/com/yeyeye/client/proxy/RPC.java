package com.yeyeye.client.proxy;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yeyeye
 * @Date 2023/5/7 20:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({ServiceBeanDefinitionRegistry.class})
public @interface RPC {
    String value() default "";
}
