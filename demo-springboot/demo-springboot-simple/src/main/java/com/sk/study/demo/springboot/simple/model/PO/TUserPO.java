package com.sk.study.demo.springboot.simple.model.PO;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author sk
 * create on  2020/5/12:19:43
 */
@Data
@Table(name = "T_User")
@NameStyle()
public class TUserPO implements Serializable {
    private static final long serialVersionUID = 7764997911093901302L;
    @Id
    @KeySql(sql = "select S_T_USER_ID.currval,S_T_USER_ID.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String certType;
    private String certNo;
}
