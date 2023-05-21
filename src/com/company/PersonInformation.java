package com.company;

import java.util.Scanner;

public class PersonInformation {
    private String name;
    private String surname;
    private short age;
    private int height;
    private int weight;

    Scanner sc = new Scanner(System.in);

    //constructor with method calls
    public PersonInformation() {
        writeName();
        writeSurname();
        writeAge();
        writeHeight();
        writeWeight();
    }

    //Method for displaying information
    public void printInfoPerson(PersonInformation personInformation) {
        System.out.println(personInformation);
    }

    //Method in which the name is entered, with exceptions, where numbers cannot be entered
    private void writeName() {
        do {
            System.out.print("Write your Name: ");
            name = sc.nextLine();
            if (stringFormatExc(name)) {
                System.out.println("Please enter a valid name...");
            }
        } while (stringFormatExc(name));

    }

    //Method in which the surname is entered, with exceptions, where numbers cannot be entered
    private void writeSurname() {
        do {
            System.out.print("Write your Surname: ");
            surname = sc.nextLine();
            if (stringFormatExc(surname)) {
                System.out.println("Please enter a valid surname...");
            }
        } while (stringFormatExc(surname));

    }

    //Method in which the age is entered, with exceptions, where no letters can be entered, and a number less than 0 and greater than 119
    private void writeAge() {
        do {
            while (true) {
                System.out.print("Write your age: ");
                if (sc.hasNextShort()) {
                    age = sc.nextShort();
                    break;
                } else {
                    System.out.println("Please enter a valid age without letters...");
                    sc.nextLine();
                }
            }
            if (!ageFormatExc(age)) {
                System.out.println("Please enter a valid age in range 0-119 (田中カ子)...");
            }
        } while (!ageFormatExc(age));

    }

    //Method in which the height is entered, with exceptions, where no letters can be entered, and a number less than 0 and greater than 272
    private void writeHeight() {
        do {
            while (true) {
                System.out.print("Write your height: ");
                if (sc.hasNextShort()) {
                    height = sc.nextInt();
                    break;
                } else {
                    System.out.println("Please enter a valid height without letters...");
                    sc.nextLine();
                }
            }
            if (!heightFormatExc(height)) {
                System.out.println("Please enter a valid height in range 0-272 (Robert Pershing Wadlow)...");
            }
        } while (!heightFormatExc(height));

    }

    //Method in which the weight is entered, with exceptions, where no letters can be entered, and a number less than 0 and greater than 635
    private void writeWeight() {
        do {
            while (true) {
                System.out.print("Write your weight: ");
                if (sc.hasNextShort()) {
                    weight = sc.nextInt();
                    break;
                } else {
                    System.out.println("Please enter a valid weight without letters...");
                    sc.nextLine();
                }
            }
            if (!weightFormatExc(weight)) {
                System.out.println("Please enter a valid weight in range 0-635 (Jon Brower Minnoch)...");
            }
        } while (!weightFormatExc(weight));
    }

// method for checking if a string contains at least one digit.
    private boolean stringFormatExc(String input) {
        return input.matches(".*\\d.*");
    }

//method for setting the range
    private boolean ageFormatExc(short input) {

        if (input >= 0 && input <= 119) {
            return true;
        } else {
            return false;
        }
    }
//method for setting the range
    private boolean heightFormatExc(int input) {

        if (input >= 0 && input <= 272) {
            return true;
        } else {
            return false;
        }
    }
//method for setting the range
    private boolean weightFormatExc(int input) {

        if (input >= 0 && input <= 635) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return '\n' +
                "You person Information: " + '\n' +
                "Name= " + name + '\n' +
                "Surname= " + surname + '\n' +
                "Age= " + age + '\n' +
                "Height= " + height + '\n' +
                "Weight= " + weight;
    }
}
