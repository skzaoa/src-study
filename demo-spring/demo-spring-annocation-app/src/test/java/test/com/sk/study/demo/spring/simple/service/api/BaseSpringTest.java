package test.com.sk.study.demo.spring.simple.service.api;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        //这里写Spring的配置文件
        "classpath:bean.xml"})
public class BaseSpringTest {
}
