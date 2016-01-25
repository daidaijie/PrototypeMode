package com.net.first;

import com.net.first.prototype.ConcretePrototype1;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1)p1.Clone();
        System.out.println(c1.getId());

    }
}
