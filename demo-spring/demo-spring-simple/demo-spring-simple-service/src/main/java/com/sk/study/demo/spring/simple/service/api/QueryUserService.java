package com.sk.study.demo.spring.simple.service.api;

import com.sk.study.demo.spring.simple.model.PO.TUserPO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:17
 */
public interface QueryUserService {
    /**
     *
     * @return
     */
    public List<TUserPO> queryUser() throws Exception;
}
