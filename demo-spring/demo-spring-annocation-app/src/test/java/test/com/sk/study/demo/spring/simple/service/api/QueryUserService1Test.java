package test.com.sk.study.demo.spring.simple.service.api;

import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:31
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:bean.xml"}) //locations 指定xml文件的位置，classpath表示类路径
//@ContextConfiguration(classes = Springc) // classes 指定注解类所在位置
public class QueryUserService1Test /*extends BaseSpringTest*/{
    private static final Logger logger = LoggerFactory.getLogger(QueryUserService1Test.class);

    /*@Autowired
    private QueryUserService queryUserService1;

    @Test
    public void queryUserServiceTest() {
        List<TUserPO> tUserPOList = new ArrayList<>();
        try {
            logger.info(queryUserService1.toString());
            tUserPOList = queryUserService1.queryUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (TUserPO tUserPO : tUserPOList) {
            logger.info(tUserPO.toString());
        }
    }*/
}
