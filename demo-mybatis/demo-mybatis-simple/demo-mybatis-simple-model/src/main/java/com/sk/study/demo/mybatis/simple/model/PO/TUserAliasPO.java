package com.sk.study.demo.mybatis.simple.model.PO;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sk
 * create on  2020/5/12:19:43
 */
public class TUserAliasPO implements Serializable {

    private static final long serialVersionUID = -8678949083614671618L;
    private Integer idAlias;
    private String nameAlias;
    private String sexAlias;
    private Date birthdayAlias;
    private String certTypeAlias;
    private String certNoAlias;

    public Integer getIdAlias() {
        return idAlias;
    }

    public void setIdAlias(Integer idAlias) {
        this.idAlias = idAlias;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getSexAlias() {
        return sexAlias;
    }

    public void setSexAlias(String sexAlias) {
        this.sexAlias = sexAlias;
    }

    public Date getBirthdayAlias() {
        return birthdayAlias;
    }

    public void setBirthdayAlias(Date birthdayAlias) {
        this.birthdayAlias = birthdayAlias;
    }

    public String getCertTypeAlias() {
        return certTypeAlias;
    }

    public void setCertTypeAlias(String certTypeAlias) {
        this.certTypeAlias = certTypeAlias;
    }

    public String getCertNoAlias() {
        return certNoAlias;
    }

    public void setCertNoAlias(String certNoAlias) {
        this.certNoAlias = certNoAlias;
    }

    @Override
    public String toString() {
        return "TUserAliasPO{" +
                "idAlias=" + idAlias +
                ", nameAlias='" + nameAlias + '\'' +
                ", sexAlias='" + sexAlias + '\'' +
                ", birthdayAlias=" + birthdayAlias +
                ", certTypeAlias='" + certTypeAlias + '\'' +
                ", certNoAlias='" + certNoAlias + '\'' +
                '}';
    }
}
