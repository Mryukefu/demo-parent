package com.example.controller;

import com.example.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @GetMapping("test")
    public Map test(){
        return demoService.test();
    }
}
