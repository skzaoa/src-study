package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/12:19:43
 */
public class TUserO2MPO implements Serializable {

    private static final long serialVersionUID = 1863604757073143053L;
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String certType;
    private String certNo;

    //增加一对多关系映射，主表实体应该包含从表实体集合引用
    private List<TTeacherPO> teacherPOList;

    private List<TStudentPO> studentPOList;

    public List<TStudentPO> getStudentPOList() {
        return studentPOList;
    }

    public void setStudentPOList(List<TStudentPO> studentPOList) {
        this.studentPOList = studentPOList;
    }

    public List<TTeacherPO> getTeacherPOList() {
        return teacherPOList;
    }

    public void setTeacherPOList(List<TTeacherPO> teacherPOList) {
        this.teacherPOList = teacherPOList;
    }

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
        return "TUserO2MPO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", certType='" + certType + '\'' +
                ", certNo='" + certNo + '\'' +
                ", teacherPOList=" + teacherPOList +
                ", studentPOList=" + studentPOList +
                '}';
    }
}
