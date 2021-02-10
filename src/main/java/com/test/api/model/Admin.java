package com.test.api.model;

import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.Timestamp;

public class Admin {
    String ReceiveDate;
    String CName;
    String PatNo;
    String  ID_Number_patient;
    String  zdy4;
//    String  DeptName;
    String ZDY7;

    public String getReceiveDate() {
        return ReceiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        ReceiveDate = receiveDate;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getPatNo() {
        return PatNo;
    }

    public void setPatNo(String patNo) {
        PatNo = patNo;
    }

    public String getID_Number_patient() {
        return ID_Number_patient;
    }

    public void setID_Number_patient(String ID_Number_patient) {
        this.ID_Number_patient = ID_Number_patient;
    }

    public String getZdy4() {
        return zdy4;
    }

    public void setZdy4(String zdy4) {
        this.zdy4 = zdy4;
    }

//    public String getDeptName() {
//        return DeptName;
//    }
//
//    public void setDeptName(String deptName) {
//        DeptName = deptName;
//    }

    public String getZDY7() {
        return ZDY7;
    }

    public void setZDY7(String ZDY7) {
        this.ZDY7 = ZDY7;
    }
}

