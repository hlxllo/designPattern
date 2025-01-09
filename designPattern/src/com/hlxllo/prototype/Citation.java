package com.hlxllo.prototype;

/**
 * @author dogofayaka
 */
public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学表现优秀，获三好学生奖项");
    }
}
