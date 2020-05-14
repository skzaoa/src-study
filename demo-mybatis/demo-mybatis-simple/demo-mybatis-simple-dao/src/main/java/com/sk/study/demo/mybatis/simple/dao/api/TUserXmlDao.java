package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.TUser;
import com.sk.study.demo.mybatis.simple.model.VO.UserVO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/12:19:42
 */
public interface TUserXmlDao {
    /**
     *
     * @return
     */
    List<TUser> findAll();

    List<TUser> findByName(String name);

    List<TUser> findByVO(UserVO userVO);

    void addTUser(TUser tUser);

    void updateTUser(TUser tUser);

    void deleteTUser(Integer id);
}
