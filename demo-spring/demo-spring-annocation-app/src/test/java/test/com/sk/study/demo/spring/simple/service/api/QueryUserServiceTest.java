package test.com.sk.study.demo.spring.simple.service.api;

import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:31
 */

public class QueryUserServiceTest extends BaseSpringTest{
    private static final Logger logger = LoggerFactory.getLogger(QueryUserServiceTest.class);

   /* @Autowired
    private QueryUserService queryUserService;

    @Test
    public void queryUserServiceTest() {
        List<TUserPO> tUserPOList = new ArrayList<>();
        try {
            logger.info(queryUserService.toString());
            tUserPOList = queryUserService.queryUser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (TUserPO tUserPO : tUserPOList) {
            logger.info(tUserPO.toString());
        }
    }*/
}
