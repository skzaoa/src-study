package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.PO.TTeacherPO;
import com.sk.study.demo.mybatis.simple.model.PO.TUserM2MPO;
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

    List<TTeacherPO> findAllTeacher();

    List<TUserM2MPO> findAllTeacherAndStudent();

    TUserPO findById(Integer id);

    List<TUserPO> findByName(String name);

    List<TUserPO> findByVO(UserVO userVO);

    void addTUser(TUserPO tUser);

    void updateTUser(TUserPO tUser);

    void deleteTUser(Integer id);
}
