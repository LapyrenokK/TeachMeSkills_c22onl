package com.company.Lesson_1_IntroductionToJava;

public class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}

