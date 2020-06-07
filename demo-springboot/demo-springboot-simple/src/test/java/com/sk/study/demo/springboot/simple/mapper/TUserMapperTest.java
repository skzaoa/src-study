package com.sk.study.demo.springboot.simple.mapper;

import com.sk.study.demo.springboot.simple.model.PO.TUserPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sk
 * create on  2020/6/7:22:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TUserMapperTest {

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void queryTest() {
        TUserPO tUserPO = tUserMapper.selectByPrimaryKey(21);
        log.info(tUserPO.toString());
    }
}