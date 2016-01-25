package com.net.first.prototype;

/**
 * Created by daidaijie on 2016/1/25.
 */
public abstract class Prototype implements Cloneable{

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract Prototype Clone() throws CloneNotSupportedException;


}
