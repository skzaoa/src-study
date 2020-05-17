package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/17:22:45
 */
public class TUserM2MPO implements Serializable {
    private static final long serialVersionUID = -7809192181256881501L;
    //增加一对多关系映射，主表实体应该包含从表实体集合引用
    private List<TTeacherPO> teacherPOList;
    private List<TStudentPO> studentPOList;

    public List<TTeacherPO> getTeacherPOList() {
        return teacherPOList;
    }

    public void setTeacherPOList(List<TTeacherPO> teacherPOList) {
        this.teacherPOList = teacherPOList;
    }

    public List<TStudentPO> getStudentPOList() {
        return studentPOList;
    }

    public void setStudentPOList(List<TStudentPO> studentPOList) {
        this.studentPOList = studentPOList;
    }

    @Override
    public String toString() {
        return "TUserM2MPO{" +
                "teacherPOList=" + teacherPOList +
                ", studentPOList=" + studentPOList +
                '}';
    }
}
