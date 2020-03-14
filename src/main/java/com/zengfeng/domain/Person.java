package com.zengfeng.domain;


public class Person {
    private Integer id;

    private String name;

    private String passWord;

    private Byte sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex=" + sex +
                '}';
    }
}