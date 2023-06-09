package com.yeyeye.client.proxy;

import cn.hutool.http.HttpUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        //指定URL
        String url = "http://localhost:8888/" + method.getName();
        //发送get请求并接收响应数据
        return HttpUtil.createGet(url).execute().body();
    }
}
