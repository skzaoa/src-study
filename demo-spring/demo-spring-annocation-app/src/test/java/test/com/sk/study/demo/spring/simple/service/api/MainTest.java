package test.com.sk.study.demo.spring.simple.service.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.start();
        QueryUserServiceTest queryUserServiceTest = new QueryUserServiceTest();
        queryUserServiceTest.queryUserServiceTest();
    }
}
