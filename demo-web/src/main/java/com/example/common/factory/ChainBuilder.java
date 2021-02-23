package com.example.common.factory;

import com.example.domain.AbstractProcess;
import com.example.domain.State1Process;
import com.example.domain.State2Process;
import com.example.domain.State3Process;

public class ChainBuilder {


    public static AbstractProcess builder(){
        AbstractProcess<String,String> state3Process = new State3Process();
        state3Process.setState("3");

        AbstractProcess<String,String> state2Process = new State2Process();
        state2Process.setAbstractProcess(state3Process);
        state2Process.setState("2");

        AbstractProcess<String,String> state1Process = new State1Process();
        state1Process.setState("1");
        state1Process.setAbstractProcess(state2Process);
        return state1Process;

    }
}
