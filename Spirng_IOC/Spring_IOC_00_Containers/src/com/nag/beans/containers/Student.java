package com.nag.beans.containers;

import java.util.Date;

public class Student {
    private String name;
    private Integer rollNo;

	Date date;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void displayInfo() {
        int hour = date.getHours();
        
        if(hour<12){
            System.out.println("Hello " + name + " Good Morning..! your roll# is " + rollNo);
        } else if (hour<16) {
            System.out.println("Hello " + name + " Good After noon..! your roll# is " + rollNo);
        } else if (hour <20) {
            System.out.println("Hello " + name + " Good Evening..! your roll# is " + rollNo);
        }else {
            System.out.println("Hello " + name + " Good Night..! your roll# is " + rollNo);
        }

    }

}
