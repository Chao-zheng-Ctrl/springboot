package cn.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloWorld {
    @RequestMapping("hi")
    @ResponseBody
    public String show(){

        return "Hello,World";

    }
}
