package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.TUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/13:19:58
 */
public interface TUserAnnotationDao {
    @Select("select * from T_User")
    List<TUser> findAll();
}
