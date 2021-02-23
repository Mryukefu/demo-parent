package com.example.domain;

public abstract class AbstractProcess<T,V> {


    private String state;

    private AbstractProcess<T,V> abstractProcess;

    public void setAbstractProcess(AbstractProcess<T, V> abstractProcess) {
        this.abstractProcess = abstractProcess;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean handle(T t, V v){

        if (t.equals(state)){
            this.process(v);
            return true;
        }
        if (abstractProcess==null){
            return false;
        }
       return abstractProcess.handle(t,v);
    }

    protected abstract Boolean process(V v);

}
