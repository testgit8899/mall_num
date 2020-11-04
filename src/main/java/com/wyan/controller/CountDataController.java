package com.wyan.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.wyan.pojo.CountData;
import com.wyan.pojo.TbAdmin;
import com.wyan.service.AdminService;
import com.wyan.service.CountDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: wyan
 * @Date: 2020-06-23 10:23
 * @Description:
 */
@RestController
@RequestMapping("countData")
public class CountDataController {

    @Autowired
    private CountDataService countDataService;

    @Autowired
    private AdminService adminService;

    @RequestMapping("findByLoginUser")
    public CountData findByLoginUser(){

        TbAdmin admin = adminService.findByName(SecurityContextHolder.getContext().getAuthentication().getName());

        CountData countData = countDataService.findByLoginUser(admin.getUserid());
        return countData;
    }
}
