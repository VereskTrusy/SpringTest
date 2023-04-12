package com.test.demo_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @RequestMapping(value="/home")
    public String index(Model model){
        model.addAttribute("test", "Hello world! This is Spring MVC project by using IntelliJ");
        return "/index";
    }
    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Object json(){
        Map<String, String> map = new HashMap<>();
        map.put("test", "Hello world!(/json) This is Spring MVC project by using IntelliJ");
        return map;
    }
}

