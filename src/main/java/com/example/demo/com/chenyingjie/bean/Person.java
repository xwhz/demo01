package com.example.demo.com.chenyingjie.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "testName='" + testName + '\'' +
                '}';
    }
}
