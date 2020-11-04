package com.wyan.service;

import com.wyan.pojo.CountData; /**
 * @Auther: wyan
 * @Date: 2020-06-23 02:06
 * @Description:
 */
public interface CountDataService {
    void save(CountData cd);

    void deleteByUserId(Integer userid);

    CountData findByLoginUser(Integer userid);
}
