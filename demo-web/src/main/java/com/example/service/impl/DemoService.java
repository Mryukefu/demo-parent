package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.po.User;
import com.example.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DemoService  implements IDemoService {


    @Autowired
    private UserMapper userMapper;
    @Override
    public Map test() {
        User user = userMapper.selectByPrimaryKey(1);
        if (user!=null){
            Map<String, Object> map = new HashMap<>();
            map.put("id",user.getId());
            map.put("username",user.getUsername());
            map.put("password",user.getPassword());
            return map;
        }
        return null;

    }
}
