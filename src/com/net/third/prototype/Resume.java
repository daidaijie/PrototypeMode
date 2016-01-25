package com.net.third.prototype;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.myClone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExpericence(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历 " + work.getWorkDate() + " " + work.getCompany());
    }

    public Object myClone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
