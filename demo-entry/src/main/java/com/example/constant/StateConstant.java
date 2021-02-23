package com.example.constant;

public enum StateConstant {
    ONE(1,"state1Process"),
    TWO(2,"state2Process"),
    ThREE(3,"state3Process");
    private Integer type;
    private String serviceName;
    StateConstant(Integer type, String serviceName) {
        this.type = type;
        this.serviceName = serviceName;
    }
    public static String  getServiceName(int type){
        StateConstant[] values = StateConstant.values();
        for (StateConstant gameRebate:values) {
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
