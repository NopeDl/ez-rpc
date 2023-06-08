package com.yeyeye.client.controller;

import com.yeyeye.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeyeye
 * @Date 2023/5/7 17:08
 */
@RestController
@RequestMapping("/rpc")
public class RpcController {
    public static final String SERVER_HOST = "127.0.0.1";
    public static final String SERVER_PORT = "8081";

    @Autowired
    private UserService userService;

    @GetMapping("/get/user/count")
    public void getUserCount() {
        userService.getUserCount();
    }
}
