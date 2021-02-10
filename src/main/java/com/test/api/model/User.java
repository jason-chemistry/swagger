package com.test.api.model;

public class User {
    String receiveData;
    String cName;
    String patNo;
    String idNumberPatient;
    String zdy4;
    String deptName;
    String zdy7;

    @Override
    public String toString() {
        return "User{" +
                "receiveData='" + receiveData + '\'' +
                ", cName='" + cName + '\'' +
                ", patNo='" + patNo + '\'' +
                ", idNumberPatient='" + idNumberPatient + '\'' +
                ", zdy4='" + zdy4 + '\'' +
                ", deptName='" + deptName + '\'' +
                ", zdy7='" + zdy7 + '\'' +
                '}';
    }

    public String getReceiveData() {
        return receiveData;
    }

    public void setReceiveData(String receiveData) {
        this.receiveData = receiveData;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getPatNo() {
        return patNo;
    }

    public void setPatNo(String patNo) {
        this.patNo = patNo;
    }

    public String getIdNumberPatient() {
        return idNumberPatient;
    }

    public void setIdNumberPatient(String idNumberPatient) {
        this.idNumberPatient = idNumberPatient;
    }

    public String getZdy4() {
        return zdy4;
    }

    public void setZdy4(String zdy4) {
        this.zdy4 = zdy4;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getZdy7() {
        return zdy7;
    }

    public void setZdy7(String zdy7) {
        this.zdy7 = zdy7;
    }
}
