package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/13.
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    public String hello(){
        return "resultPage";
    }
}
