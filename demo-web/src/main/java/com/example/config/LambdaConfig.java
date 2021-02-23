package com.example.config;

import com.example.vo.GameRebateInfoVO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
public class LambdaConfig {

    //     ONE(1,"mostDayGameRebate"),
    //    TWO(2,"muchQuoGameRebate"),
    //    ThREE(3,"otherGameRebate"),
    //    FOUR(4,"singleGameRebate") ;

    @Bean(name = "mostDayGameRebate")
    public Consumer<GameRebateInfoVO> getMostDayGameRebate(){
        return t1-> System.out.println(t1.getActType());
    }
    @Bean(name = "muchQuoGameRebate")
    public Consumer getMuchQuoGameRebate(){
        return t1-> System.out.println("muchQuoGameRebate");
    }
    @Bean(name = "otherGameRebate")
    public Consumer getOtherGameRebate(){
        return t1-> System.out.println("otherGameRebate");
    }
    @Bean(name = "singleGameRebate")
    public Consumer getSingleGameRebate(){
        return t1-> System.out.println("singleGameRebate");
    }


}
