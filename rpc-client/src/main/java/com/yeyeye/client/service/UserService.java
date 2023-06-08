package com.yeyeye.client.service;

import com.yeyeye.client.domain.po.User;

/**
 * @author yeyeye
 * @Date 2023/5/7 17:29
 */
public interface UserService {
    Integer getUserCount();

    User getUser(Integer userId);
}
