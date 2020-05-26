package test.com.sk.study.demo.spring.simple.service.api;

import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:31
 */
public class QueryUserServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(QueryUserServiceTest.class);
    @Test
    public void queryUserServiceTest()  {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        QueryUserService queryUserService = (QueryUserService) ac.getBean("queryUserService");
        QueryUserService queryUserService1 = ac.getBean("queryUserService", QueryUserService.class);

        List<TUserPO> tUserPOList = new ArrayList<>();
        List<TUserPO> tUserPOList1 = new ArrayList<>();
        try {
            tUserPOList = queryUserService.queryUser();
            tUserPOList1 = queryUserService1.queryUser();
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (TUserPO tUserPO : tUserPOList) {
            logger.info(tUserPO.toString());
        }
        for (TUserPO tUserPO : tUserPOList1) {
            logger.info(tUserPO.toString());
        }

    }
}
