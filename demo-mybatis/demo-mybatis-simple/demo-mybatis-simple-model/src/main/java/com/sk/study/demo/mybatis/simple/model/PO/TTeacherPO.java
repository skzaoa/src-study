package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;

/**
 * @author sk
 * create on  2020/5/17:20:26
 */
public class TTeacherPO  implements Serializable {
    private static final long serialVersionUID = 7748053269156643611L;
    private Integer id;
    private Integer tid;
    private Integer gradeNo;
    private Integer classNo;
    private String subject;

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

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TTeacherPO{" +
                "id=" + id +
                ", tid=" + tid +
                ", gradeNo=" + gradeNo +
                ", classNo=" + classNo +
                ", subject='" + subject + '\'' +
                ", tUserPO=" + tUserPO +
                '}';
    }
}
