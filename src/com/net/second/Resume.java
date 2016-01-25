package com.net.second;

import java.util.Objects;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExpericence(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历 " + timeArea + " " + company);
    }

    public Object myClone() throws CloneNotSupportedException {
        return this.clone();
    }
}
