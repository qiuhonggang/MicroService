package com.stocsis.gavin.provider.controller;

import com.stocsis.gavin.registry.service.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qhg on 16/7/1.
 */
public class IndexController {


    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();

        TestRegistryService testRegistryService = (TestRegistryService) context.getBean("testRegistryService"); // 获取远程服务代理
        String hello = testRegistryService.hello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
        System.in.read();
    }
}
