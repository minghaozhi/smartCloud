package com.smartcloud.entity;

/**
 * Created by minghaozhi on 2017/1/10.
 */
public class Person {
    private String name;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Person(){
        super();
    }
    public Person(String name,Integer age){
        super();
        this.name=name;
        this.age=age;
    }
}
