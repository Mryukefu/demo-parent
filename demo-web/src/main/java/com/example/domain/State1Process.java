package com.example.domain;

import org.springframework.stereotype.Service;

@Service(value = "state1Process")
public class State1Process extends AbstractProcess<String,String>{
    @Override
    protected Boolean process(String s) {
        System.out.println(s+": 未开始");
        return true;
    }
}
