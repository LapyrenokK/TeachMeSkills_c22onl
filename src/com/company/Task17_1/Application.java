package com.company.Task17_1;


public class Application {

    private IPaddress iPaddress = new IPaddress();
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();


    public void start() {
        while (true) {
            reader.reader("Enter your IP address for validation check...");
            if (iPaddress.isValidation(writer.writer())) {
                reader.reader("IP address is validation...");
            } else {
                reader.reader("IP address not validation...");
            }
            reader.reader("Enter 1- EXIT, 2-CONTINUE...");
            if (writer.writer().equalsIgnoreCase("1")) {
                break;
            }
        }
    }
}
