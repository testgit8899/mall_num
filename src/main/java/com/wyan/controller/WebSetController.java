package com.wyan.controller;

import com.wyan.common.EntityResult;
import com.wyan.common.Result;
import com.wyan.pojo.WebSet;
import com.wyan.service.WebSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyan
 * @Date: 2020-06-02 12:05
 * @Description:
 */
@RestController
@RequestMapping("webSet")
public class WebSetController {

    @Autowired
    private WebSetService webSetService;

    @RequestMapping("findOne")
    public EntityResult findOne(){
        String userId = SecurityContextHolder.getContext().getAuthentication().getName();
        WebSet set = webSetService.findByUserId(userId);
        EntityResult result = new EntityResult();
        result.setSuccess(true);
        result.setData(set);
        return result;
    }
    @RequestMapping("add")
    public Result add(WebSet webSet){
        webSetService.add(webSet);
        return new Result(true,"操作成功");
    }
    @RequestMapping("update")
    public Result update(WebSet webSet){
        webSetService.update(webSet);
        return new Result(true,"操作成功");
    }
}
