package com.net.third;

import com.net.third.prototype.Resume;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExpericence("1998-2000","XX公司");

        Resume b = (Resume)a.myClone();
        b.setWorkExpericence("1998-2006","YY企业");

        Resume c = (Resume)a.myClone();
        c.setPersonalInfo("男","24");
        c.setWorkExpericence("1998-2003","ZZ企业");

        a.display();
        b.display();
        c.display();

    }
}
