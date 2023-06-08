package com.yeyeye.client.proxy;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author yeyeye
 * @Date 2023/5/7 20:18
 */
public class ServiceBeanFactory<T> implements FactoryBean<T> {
    private Class<T> interFaceClazz;

    public ServiceBeanFactory(Class<T> interFaceClazz) {
        this.interFaceClazz = interFaceClazz;
    }

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(
                interFaceClazz.getClassLoader(),
                new Class[]{interFaceClazz},
                new ServiceInvocationHandler());
    }

    @Override
    public Class<?> getObjectType() {
        return interFaceClazz;
    }
}
