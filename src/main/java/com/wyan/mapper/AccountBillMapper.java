package com.wyan.mapper;

import com.wyan.pojo.AccountBill;

import java.util.List;
import java.util.Map;

public interface AccountBillMapper {


    List<AccountBill> findAllBill(Map searchMap);

    List<Map> countMoneyByUser(Map searchMap);
}