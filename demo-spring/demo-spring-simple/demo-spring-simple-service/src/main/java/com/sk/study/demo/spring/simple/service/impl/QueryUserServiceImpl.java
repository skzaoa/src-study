package com.sk.study.demo.spring.simple.service.impl;

import com.sk.study.demo.spring.simple.dao.api.TUserDao;
import com.sk.study.demo.spring.simple.dao.impl.TUserDaoImpl;
import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:21
 */
public class QueryUserServiceImpl implements QueryUserService {

    @Override
    public List<TUserPO> queryUser() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        TUserDao tUserDao = ac.getBean("tUserDao", TUserDao.class);

        List<TUserPO> tUserPOList = tUserDao.findAll();
        if (CollectionUtils.isEmpty(tUserPOList)){
            throw new Exception("用户不存在");
        }
        return tUserPOList;
    }
}
