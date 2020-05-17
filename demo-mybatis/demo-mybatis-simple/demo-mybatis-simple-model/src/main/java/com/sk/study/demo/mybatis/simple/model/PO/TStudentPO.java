package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;

/**
 * @author sk
 * create on  2020/5/17:20:26
 */
public class TStudentPO  implements Serializable {
    private static final long serialVersionUID = -3362631377999975223L;
    private Integer id;
    private Integer sid;
    private Integer gradeNo;
    private Integer classNo;

    private TUserPO tUserPO;

    public TUserPO gettUserPO() {
        return tUserPO;
    }

    public void settUserPO(TUserPO tUserPO) {
        this.tUserPO = tUserPO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(Integer gradeNo) {
        this.gradeNo = gradeNo;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "TStudentPO{" +
                "id=" + id +
                ", sid=" + sid +
                ", gradeNo=" + gradeNo +
                ", classNo=" + classNo +
                ", tUserPO=" + tUserPO +
                '}';
    }
}
