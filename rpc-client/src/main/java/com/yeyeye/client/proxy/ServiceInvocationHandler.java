package com.yeyeye.client.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author yeyeye
 * @Date 2023/5/7 20:22
 */
public class ServiceInvocationHandler implements InvocationHandler {
    /**
     * 这里就直接进行远程RPC调用了
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("【" + proxy.getClass() + "】执行了远程调用方法：" + method + "【参数】：" + Arrays.toString(args));
        return null;
    }
}
