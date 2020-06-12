package com.sk.study.demo.springcloud.simple.consumer.model.PO;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @author sk
 * create on  2020/5/12:19:43
 */

@Data
@JSONType(orders = {"id","name","sex","birthday","certType","certNo"})
public class TUserPO implements Serializable {
    private static final long serialVersionUID = 7764997911093901302L;
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String certType;
    private String certNo;
}
