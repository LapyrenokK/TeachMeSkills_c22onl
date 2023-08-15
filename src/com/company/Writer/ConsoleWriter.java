package com.company.Writer;

import java.util.Scanner;

public class ConsoleWriter implements Writer{
    @Override
    public String writer() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
