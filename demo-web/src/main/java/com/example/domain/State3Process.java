package com.example.domain;

import org.springframework.stereotype.Service;

@Service(value = "state3Process")
public class State3Process extends AbstractProcess<String,String>  {


    @Override
    protected Boolean process(String s) {
        System.out.println(s+": 已结束");
        return true;
    }
}
