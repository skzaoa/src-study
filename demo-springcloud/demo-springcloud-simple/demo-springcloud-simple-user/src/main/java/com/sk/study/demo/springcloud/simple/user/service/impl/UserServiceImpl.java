package com.sk.study.demo.springcloud.simple.user.service.impl;

import com.sk.study.demo.springcloud.simple.user.mapper.TUserMapper;
import com.sk.study.demo.springcloud.simple.user.model.BO.UserBO;
import com.sk.study.demo.springcloud.simple.user.model.PO.TUserPO;
import com.sk.study.demo.springcloud.simple.user.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sk
 * create on  2020/6/9:22:11
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper tUserMapper;

    @Override
    public UserBO queryById(Integer id) {
        UserBO userBO = new UserBO();
        TUserPO tUserPO = tUserMapper.selectByPrimaryKey(id);

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
}
