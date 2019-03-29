package com.lj.serviceribbon.controller;

import com.lj.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
