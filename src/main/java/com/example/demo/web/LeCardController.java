package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LeCardController {

    @RequestMapping("/say")
    public String sayHello() {
        synchronized (this) {
            return "Hello,bro!!!";
        }

    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        System.out.println(sb.toString());
        System.out.println(100 == 100);
        System.out.println(1000 == 1000);
    }

}
