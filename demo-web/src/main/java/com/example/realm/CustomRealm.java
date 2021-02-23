package com.example.realm;

import com.example.mapper.UserMapper;
import com.example.po.Role;
import com.example.po.User;
import com.example.po.UserExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Wrapper;

public class CustomRealm /*extends AuthorizingRealm*/ {


 /*   @Autowired
    private UserMapper userMapper;

    *//**
     * 授权
     * @param principalCollection
     * @return
     *//*
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        String name= (String) principalCollection.getPrimaryPrincipal();
        //查询用户名称
        User user = userMapper.selectByUserName(name);
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        return simpleAuthorizationInfo;
    }

    *//**
     * 登入
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     *//*
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String name =(String)authenticationToken.getPrincipal();
        User user =  userMapper.selectByUserName(name);
        if (user==null){
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name, user.getPassword().toString(), getName());
            return simpleAuthenticationInfo;
        }

    }*/
}
