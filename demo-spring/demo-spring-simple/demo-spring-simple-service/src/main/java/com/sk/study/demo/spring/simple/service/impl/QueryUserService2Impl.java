package com.sk.study.demo.spring.simple.service.impl;

import com.sk.study.demo.spring.simple.dao.api.TUserDao;
import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 用于创建对象的注解
 *      Component 把当前类对象存入spring容器中
 *           属性 value 用于指定bean的id，默认当前类名首字母小写
 *      controller 同上 一般用于表现层
 *      Service 同上 一般用于业务层
 *      Repossitory 同上 一般用于持久层
 * 用于注入数据的注解
 *      Autowired
 * @author sk
 * create on  2020/5/21:22:21
 */
@Service("queryUserService2")
public class QueryUserService2Impl implements QueryUserService {
    public QueryUserService2Impl() {
        System.out.println("QueryUserService1Imp2 init");
    }

    @Autowired
    @Qualifier("tUserDao2")
    TUserDao tUserDao;

    //@Test
    public void tUserDao1Test() throws Exception {
        System.out.println(tUserDao.toString());
        List<TUserPO> tUserPOList = tUserDao.findAll();
        if (CollectionUtils.isEmpty(tUserPOList)){
            throw new Exception("用户不存在");
        }
    }

    @Override
    public List<TUserPO> queryUser() throws Exception {
        List<TUserPO> tUserPOList = tUserDao.findAll();
        if (CollectionUtils.isEmpty(tUserPOList)){
            throw new Exception("用户不存在");
        }
        return tUserPOList;
    }
}

