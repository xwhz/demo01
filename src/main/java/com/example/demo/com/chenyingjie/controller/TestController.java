package com.example.demo.com.chenyingjie.controller;


import com.example.demo.com.chenyingjie.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private Person person;
    @RequestMapping("/")
    String hello(){
        return person.getTestName();
    }
}
