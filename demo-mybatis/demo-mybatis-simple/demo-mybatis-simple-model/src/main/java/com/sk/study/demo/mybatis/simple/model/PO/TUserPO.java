package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sk
 * create on  2020/5/12:19:43
 */
public class TUserPO implements Serializable {
    private static final long serialVersionUID = -7371868231552063463L;
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String certType;
    private String certNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    @Override
    public String toString() {
        return "TUserPO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", certtype='" + certType + '\'' +
                ", certno='" + certNo + '\'' +
                '}';
    }
}
