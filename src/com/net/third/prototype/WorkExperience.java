package com.net.third.prototype;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class WorkExperience  implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object myClone() throws CloneNotSupportedException {
        return this.clone();
    }
}
