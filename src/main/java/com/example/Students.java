package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    

    @Id
    private int RollNo;
    
    private String SName;
    private int Sage;
    

    @Override
    public String toString() {
        return "Students [RollNo=" + RollNo + ", SName=" + SName + ", Sage=" + Sage + "]";
    }


    public int getRollNo() {
        return RollNo;
    }


    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }


    public String getSName() {
        return SName;
    }


    public void setSName(String sName) {
        SName = sName;
    }


    public int getSage() {
        return Sage;
    }


    public void setSage(int sage) {
        Sage = sage;
    }


   

    
}
