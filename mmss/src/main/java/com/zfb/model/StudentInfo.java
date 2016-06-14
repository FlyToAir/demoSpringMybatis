package com.zfb.model;

/**
 * Created by BG241127 on 2016/6/12.
 */
public class StudentInfo {
    private String id;
    private String name;
    private int age;
    private char sex;

    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setSex(char sex){this.sex = sex;}
    public String getId(){ return id;}
    public String getName(){ return name;}
    public int getAge(){return age;}
    public char getSex(){ return sex;}
}
