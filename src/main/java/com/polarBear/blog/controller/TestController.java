package com.polarBear.blog.controller;

import com.polarBear.blog.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        System.out.println("hello word");
        return "hello";
    }

    @ResponseBody
    @GetMapping("/test-json")
    public User testJson(){

        User user = new User("panyexiong", 25,1);

        return user;
    }
}
