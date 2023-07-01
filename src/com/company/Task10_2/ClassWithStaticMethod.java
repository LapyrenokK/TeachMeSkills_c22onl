package com.company.Task10_2;


public class ClassWithStaticMethod {


    static boolean registration(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {


        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Login greater than 20 characters or contains a space!!!");
        } else if (password.length() > 20 || password.contains(" ")||!password.matches(".*[0-9].*")){
            throw new WrongPasswordException("Password greater than 20 characters or contains a space!!!");
        }else if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Password and confirmPassword not equals!!!\n"
                    + "password: " + password
                    + "\nconfirmPassword: " + confirmPassword);
        }else {
            return true;
        }
    }

}
