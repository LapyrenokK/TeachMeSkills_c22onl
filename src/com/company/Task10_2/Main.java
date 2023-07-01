package com.company.Task10_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scin = new Scanner(System.in);) {
            System.out.println("Enter your login...");
            String login = scin.nextLine();

            System.out.println("Enter your password...");
            String password = scin.nextLine();

            System.out.println("Confirm your password...");
            String confirmPassword = scin.nextLine();

            ClassWithStaticMethod.registration(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
    }
}
