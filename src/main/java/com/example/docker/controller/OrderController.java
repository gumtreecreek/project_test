package com.example.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("order/docker")
    public String helloDocker(){
        return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }

    @RequestMapping(value = "/order/index",method = RequestMethod.GET)
    public String index(){
        System.out.println("git test");
        return "服务端口号: "+"\t"+UUID.randomUUID().toString();


    }

}
