package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.PO.TUserO2MPO;
import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;
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
    List<TUserPO> findAll();

    List<TUserO2MPO> findAllTeacher();

    List<TUserO2MPO> findAllTeacherAndStudent();

    List<TUserPO> findByName(String name);

    List<TUserPO> findByVO(UserVO userVO);

    void addTUser(TUserPO tUser);

    void updateTUser(TUserPO tUser);

    void deleteTUser(Integer id);
}
