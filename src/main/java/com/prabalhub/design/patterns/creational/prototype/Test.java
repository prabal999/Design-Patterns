package com.prabalhub.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * The prototype pattern is used to instantiate a new object by copying all of the properties of an
 * existing object, creating an independent clone. This practice is particularly useful when the
 * construction of a new object is inefficient.
 * 
 * @author Prabal Srivastava
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student ram = new Student();
        ram.setName("Ram");
        Standard nine = new Standard();
        nine.setName("IX");
        Subject hindi = new Subject();
        hindi.setName("Hindi");
        Subject english = new Subject();
        english.setName("English");
        List<Subject> subjects = new ArrayList<>();
        subjects.add(hindi);
        subjects.add(english);

        ram.setStandard(nine);
        ram.setSubjects(subjects);

        Student sham = ram.clone();
        sham.setName("Sham");
        english.setName("English First");

        // Deep cloning testing
        System.out.println(ram);
        System.out.println(sham);
    }
}

class Student implements PrototypeCapable {

    private String name;

    private Standard standard;

    private List<Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student)super.clone();
        student.setStandard(getStandard().clone());
        List<Subject> subjects = new ArrayList<>(getSubjects().size());
        for(Subject subject : getSubjects()) {
            subjects.add(subject.clone());
        }
        student.setSubjects(subjects);
        return student;
    }

    @Override
    public String toString() {
        return "Student:" + name + standard + " subjects:" + subjects;
    }
}

class Standard implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Standard clone() throws CloneNotSupportedException {
        return (Standard)super.clone();
    }

    @Override
    public String toString() {
        return " Standard:" + name;
    }
}

class Subject implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Subject clone() throws CloneNotSupportedException {
        return (Subject)super.clone();
    }

    @Override
    public String toString() {
        return name;
    }
}
