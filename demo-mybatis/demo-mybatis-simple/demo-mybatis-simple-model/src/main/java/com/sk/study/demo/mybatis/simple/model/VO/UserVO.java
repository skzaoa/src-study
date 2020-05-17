package com.sk.study.demo.mybatis.simple.model.VO;

import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;

import java.io.Serializable;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/14:21:09
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1225197764191451821L;
    private TUserPO tUser;
    private String otherName;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public TUserPO gettUser() {
        return tUser;
    }

    public void settUser(TUserPO tUser) {
        this.tUser = tUser;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "tUser=" + tUser +
                ", otherName='" + otherName + '\'' +
                ", ids=" + ids +
                '}';
    }
}

