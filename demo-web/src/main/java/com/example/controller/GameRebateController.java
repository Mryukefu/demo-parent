package com.example.controller;

import com.example.service.IGameRebateService;
import com.example.vo.GameRebateInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 游戏返利管理
 */
@RestController
@RequestMapping(value = "game/rebate")
public class GameRebateController {

    @Autowired
    private IGameRebateService gameRebateService;


    @PostMapping
    public Boolean saveInfo(@RequestBody GameRebateInfoVO gameRebateInfoVO){
       return gameRebateService.saveInfo(gameRebateInfoVO);


    }

    @PatchMapping("{id}/{state}")
    public Boolean examState(@PathVariable(value = "id")Integer id,@PathVariable(value = "state")String state){
        return gameRebateService.examState(id,state);


    }



}
