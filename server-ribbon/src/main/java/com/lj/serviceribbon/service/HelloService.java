package com.lj.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;

    //通过负载均衡调用springcloud-client中的服务
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-test/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+ name + ", sorry, error!";
    }
}
