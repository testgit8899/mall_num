package com.wyan.controller;

import com.wyan.common.EntityResult;
import com.wyan.common.Result;
import com.wyan.pojo.ProfitSet;
import com.wyan.pojo.WebSet;
import com.wyan.service.ProfitService;
import com.wyan.service.WebSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 12:05
 * @Description:
 */
@RestController
@RequestMapping("profit")
public class ProfitSetController {

    @Autowired
    private ProfitService profitService;

    @RequestMapping("findList")
    public List<ProfitSet> findList(){

        return profitService.findList();
    }
    @RequestMapping("update")
    public Result update(ProfitSet webSet){
        ProfitSet set = profitService.findOneByLevel(webSet.getAgentLevel());
        if(null==set){
            profitService.add(webSet);
        }else{
            profitService.update(webSet);
        }
        return new Result(true,"操作成功");
    }

}
