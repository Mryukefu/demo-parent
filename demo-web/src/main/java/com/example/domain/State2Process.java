package com.example.domain;

import org.springframework.stereotype.Service;

@Service(value = "state2Process")
public class State2Process extends AbstractProcess<String,String>{
    @Override
    protected Boolean process(String s) {
        System.out.println(s+": 进行中");
        return true;
    }
}
