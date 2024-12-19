package com.example.releasetest.controller;

import com.example.releasetest.controller.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengrh
 * @date 2024/4/29 14:53
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/api/test")
    public String test() {
        return "test";
    }

    @GetMapping("/user/user-info")
    public String user() {
        return "user";
    }

    @GetMapping("/demo/demo")
    public String demo() {
        return "demo";
    }
}
