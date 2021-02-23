package com.example.constant;

import org.omg.CORBA.PUBLIC_MEMBER;

public enum  GameRebate {
    ONE(1,"mostDayGameRebate"),
    TWO(2,"muchQuoGameRebate"),
    ThREE(3,"otherGameRebate"),
    FOUR(4,"singleGameRebate") ;
    private Integer type;
    private String serviceName;


    GameRebate(Integer type, String serviceName) {
        this.type = type;
        this.serviceName = serviceName;
    }
    public static String  getServiceName(int type){
        GameRebate[] values = GameRebate.values();
        for (GameRebate gameRebate:values) {
            if (gameRebate.getType()==type){
              return   gameRebate.getServiceName();
            }
        }
        return null;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


}
