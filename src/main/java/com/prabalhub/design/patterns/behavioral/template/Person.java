package com.prabalhub.design.patterns.behavioral.template;


public class Person implements Comparable<Person>{

    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
