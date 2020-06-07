package com.sk.study.demo.springboot.simple.service.impl;

import com.sk.study.demo.springboot.simple.mapper.TUserMapper;
import com.sk.study.demo.springboot.simple.model.BO.UserBO;
import com.sk.study.demo.springboot.simple.model.PO.TUserPO;
import com.sk.study.demo.springboot.simple.service.api.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sk
 * create on  2020/6/7:22:40
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {

    @Autowired
    TUserMapper tUserMapper;
    @Override
    public UserBO queryById(Integer id) {
        UserBO userBO = new UserBO();
        TUserPO tUserPO =  tUserMapper.selectByPrimaryKey(id);
        if (tUserPO == null){
            userBO.setRetCode("1");
            userBO.setRetMessage("没有对应id记录");
            return userBO;
        }
        userBO.setRetCode("0");
        userBO.setRetMessage("成功");
        userBO.setTUserPO(tUserPO);
        return userBO;
    }

    @Override
    @Transactional
    public void insert(TUserPO tUserPO) {
        tUserMapper.insert(tUserPO);
    }


}
