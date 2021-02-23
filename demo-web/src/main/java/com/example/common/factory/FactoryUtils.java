package com.example.common.factory;

import com.example.domain.AbstractGameRebateTemplate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.applet.AppletContext;

@Component
public class FactoryUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }



    public static  <T> T  getBean(String beanName,Class<T> tClass ){
        return (T)applicationContext.getBean(beanName);
    }
}
