package com.example.releasetest.controller.service;

import org.springframework.stereotype.Service;

import java.util.function.IntFunction;

/**
 * @author chengrh
 * @date 2024/7/8 15:23
 */
@Service
public class TestService {
    public String apply(IntFunction<String> function, int value) {
        return function.apply(value);
    }
}
