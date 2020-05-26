package test.com.sk.study.demo.spring.simple.service.api;

import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QueryUserService2Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        QueryUserService queryUserService = ac.getBean("queryUserService2", QueryUserService.class);

        try {
            queryUserService.queryUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
