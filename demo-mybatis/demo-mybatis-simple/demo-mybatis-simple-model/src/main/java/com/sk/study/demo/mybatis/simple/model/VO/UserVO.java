package com.sk.study.demo.mybatis.simple.model.VO;

import com.sk.study.demo.mybatis.simple.model.TUser;

import java.io.Serializable;

/**
 * @author sk
 * create on  2020/5/14:21:09
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1225197764191451821L;
    TUser tUser;
    String otherName;

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "tUser=" + tUser +
                ", otherName='" + otherName + '\'' +
                '}';
    }
}
