package com.company.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> nameStudents = new ArrayList<>(Arrays.asList(
                "Kirill",
                "Dima",
                "Ilya",
                "Ivan",
                "Nicholas",
                "Victor",
                "Artem",
                "Alena",
                "Danik",
                "arseny",
                "Nasty",
                "Arina",
                "Aleksander",
                "kiriLL"));

        System.out.println(nameStudents.stream().filter(s->s.equalsIgnoreCase("KIRILL")).toList());
        System.out.println(nameStudents.stream().filter(s->s.startsWith("a")|s.startsWith("A")).toList());
        System.out.println(nameStudents.stream().sorted().findFirst().orElse("Empty"));


    }
}
