package com.example.domain;

import com.example.vo.GameRebateInfoCommon;
import com.example.vo.GameRebateInfoVO;


/**
 * 抽象的游戏返利模板
 */
public abstract class AbstractGameRebateTemplate<T extends GameRebateInfoCommon>{


    /**
     * 添加返利信息
     * @param t
     * @return
     */
    public boolean saveInfo(T  t){
        System.out.println("tttttt");
        return false;
    }
}
