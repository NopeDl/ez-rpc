package com.yeyeye.client.domain;

import lombok.Builder;

/**
 * @author yeyeye
 * @Date 2023/5/7 17:09
 */
@Builder
public class Response<T> {
    public String msg;
    public String code;
    public T data;
}
