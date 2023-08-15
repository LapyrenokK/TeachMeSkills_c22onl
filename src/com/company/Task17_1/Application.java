package com.company.Task17_1;


import com.company.Reader.ConsoleReader;
import com.company.Reader.Reader;
import com.company.Writer.ConsoleWriter;
import com.company.Writer.Writer;

public class Application {

    private IPaddress iPaddress = new IPaddress();
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();


    public void start() {
        while (true) {
            reader.consoleReader("Enter your IP address for validation check...");
            if (iPaddress.isValidation(writer.writer())) {
                reader.consoleReader("IP address is validation...");
            } else {
                reader.consoleReader("IP address not validation...");
            }
            reader.consoleReader("Enter 1- EXIT, 2-CONTINUE...");
            if (writer.writer().equalsIgnoreCase("1")) {
                break;
            }
        }
    }
}
