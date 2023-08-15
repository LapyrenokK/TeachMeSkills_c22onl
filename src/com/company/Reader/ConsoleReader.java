package com.company.Reader;

public class ConsoleReader implements Reader{
    @Override
    public void consoleReader(String message) {
        System.out.println(message);;
    }
}
