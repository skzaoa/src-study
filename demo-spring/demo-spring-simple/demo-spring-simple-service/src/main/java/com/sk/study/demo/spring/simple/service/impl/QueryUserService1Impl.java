package com.sk.study.demo.spring.simple.service.impl;

import com.sk.study.demo.spring.simple.dao.api.TUserDao;
import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
@Service("queryUserService1")
public class QueryUserService1Impl implements QueryUserService {
    public QueryUserService1Impl() {
        System.out.println("QueryUserService1Impl init");
    }

    //@Autowired //按照类型注入，Ioc容器中没有则报错，一个正常注入，有多个时按照名称注入
    //@Qualifier("tUserDao1") //在按照类型注入的基础上，按照名称注入，给类注入时不能单独使用（依托于Autowired），但是给方法注入时可以
    @Resource(name = "tUserDao1") //此注解不依托于Autowired
    TUserDao tUserDao; //比如用了Qualifier指定了名称，此处可以注入成功

    //以上注解，只能注入其他bean数据，不能注入基本类型和String类型数据。
    //集合类型只能通过xml来注入

    //Value注解可以用于注入基本类型和String类型数据
    //属性：value：用于指定数据的值，

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

