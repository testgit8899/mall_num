package com.wyan.mapper;

import com.wyan.pojo.CountData;

/**
 * @Auther: wyan
 * @Date: 2020-06-23 02:01
 * @Description:
 */
public interface CountDataMapper {

    public void save(CountData data);

    public CountData findByUserId(Integer userId);

    void deleteByUserId(Integer userid);

    CountData findByLoginUser(Integer userid);

    void updateInfo(CountData countData);
}
