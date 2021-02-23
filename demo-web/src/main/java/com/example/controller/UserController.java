package com.example.controller;

import com.example.service.IDemoService;
import com.example.service.IUserService;
import jdk.nashorn.internal.ir.RuntimeNode;
//import org.apache.shiro.SecurityUtils;
///import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

   /* @GetMapping("login")
    public Map login(String suName,String password){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                suName,
                password);
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        Map<String, Object> map = new HashMap<>();
        map.put("staus",1);
        map.put("code",200);
        return map;

    }*/
}
