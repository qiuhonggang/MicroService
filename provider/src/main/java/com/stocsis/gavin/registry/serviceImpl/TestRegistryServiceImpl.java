package com.stocsis.gavin.registry.serviceImpl;

import com.stocsis.gavin.registry.service.TestRegistryService;

/**
 * Created by qhg on 16/6/30.
 */
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello "+name;
    }
}
