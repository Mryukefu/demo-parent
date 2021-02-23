package com.example.service;

import com.example.vo.GameRebateInfoVO;

public interface IGameRebateService {

    /**
     * 保存游戏返利活动
     * @param gameRebateInfoVO
     * @return
     */
    Boolean saveInfo(GameRebateInfoVO gameRebateInfoVO);

    Boolean examState(Integer id, String state);
}
