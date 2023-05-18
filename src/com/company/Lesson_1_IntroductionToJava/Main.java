package com.company.Lesson_1_IntroductionToJava;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Kir", "Lap", 31);
        printInfoPerson(person1);

        System.out.printf("Hello %s in %x%x !!! \n", "word", 32,35);

        //\u000d System.out.print("Выполняемый комментарий 0_0");

    }
    static void printInfoPerson(Person person) {
        String strPerson = String.valueOf(person);
        System.out.println(strPerson);
    }
}
