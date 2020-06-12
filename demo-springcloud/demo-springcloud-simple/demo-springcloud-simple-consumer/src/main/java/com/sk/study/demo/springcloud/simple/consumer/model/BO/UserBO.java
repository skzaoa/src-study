package com.sk.study.demo.springcloud.simple.consumer.model.BO;

import com.alibaba.fastjson.annotation.JSONType;
import com.sk.study.demo.springcloud.simple.consumer.model.PO.TUserPO;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sk
 * create on  2020/6/7:23:04
 */
@Data
@JSONType(orders = {"tUserPO","retCode","retMessage"})
public class UserBO implements Serializable {
    private static final long serialVersionUID = 2087841267908088733L;
    private TUserPO tUserPO;
    private String retCode;
    private String retMessage;
}
