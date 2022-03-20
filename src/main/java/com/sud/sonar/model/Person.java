package com.sud.sonar.model;

public class Person {
    String name;
    String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    @Deprecated
    public Boolean nameMatches(String name){
        return this.name.equalsIgnoreCase(name);
    }
}
