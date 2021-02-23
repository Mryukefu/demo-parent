package com.example.service.impl;

import com.example.common.factory.ChainBuilder;
import com.example.common.factory.FactoryUtils;
import com.example.constant.GameRebate;
import com.example.constant.StateConstant;
import com.example.domain.AbstractGameRebateTemplate;
import com.example.domain.AbstractProcess;
import com.example.service.IGameRebateService;
import com.example.vo.GameRebateInfoCommon;
import com.example.vo.GameRebateInfoVO;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class GameRebateService implements IGameRebateService {

    /**
     * 保存游戏返利
     * @param gameRebateInfoVO
     * @return
     */
   /* @Override
    public Boolean saveInfo(GameRebateInfoVO gameRebateInfoVO) {
        Integer actType = gameRebateInfoVO.getActType();;
        AbstractGameRebateTemplate abstractGameRebateTemplate = FactoryUtils.getBean(GameRebate.getServiceName(actType), AbstractGameRebateTemplate.class);
        return abstractGameRebateTemplate.saveInfo(gameRebateInfoVO);
    }*/

    @Override
    public Boolean saveInfo(GameRebateInfoVO gameRebateInfoVO) {
        Integer actType = gameRebateInfoVO.getActType();;
        Consumer consumer = FactoryUtils.getBean(GameRebate.getServiceName(actType), Consumer.class);
        //return abstractGameRebateTemplate.saveInfo(gameRebateInfoVO);
        doTemplate(gameRebateInfoVO,consumer);
       // doTemplate(gameRebateInfoVO,(GameRebateInfoVO t)-> System.out.println(t.getActType()));
        return false;
    }

    @Override
    public Boolean examState(Integer id, String state) {
     //   AbstractProcess abstractProcess = FactoryUtils.getBean(GameRebate.getServiceName(state), AbstractProcess.class);
          return ChainBuilder.builder().handle(state,state);
    }


    private void doTemplate(GameRebateInfoVO gameRebateInfoVO, Consumer<GameRebateInfoVO> consumer){
        consumer.accept(gameRebateInfoVO);
    }

}
