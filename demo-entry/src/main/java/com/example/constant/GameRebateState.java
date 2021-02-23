package com.example.constant;

public enum GameRebateState {
    FAIL(1,"FAIL"),
    SUCCESS(2,"SUCCESS");

    private Integer state;
    private String serviceName;


    GameRebateState(Integer state, String serviceName) {
        this.state = state;
        this.serviceName = serviceName;
    }
    public static String  getServiceName(int type){
        GameRebateState[] values = GameRebateState.values();
        for (GameRebateState gameRebate:values) {
            if (gameRebate.getType()==type){
              return   gameRebate.getServiceName();
            }
        }
        return null;
    }
    public Integer getType() {
        return state;
    }

    public void setType(Integer state) {
        this.state = state;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


}
