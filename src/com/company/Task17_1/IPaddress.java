package com.company.Task17_1;

import java.util.regex.Pattern;

public class IPaddress {
    private static final String IP_ADDRESS_CHECK ="(?<!\\d)(?:25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(?:\\.(?:25[0-5]|2[0-4]\\d|[01]?\\d\\d?)){3}(?!\\d)";


    public IPaddress() {
    }

    public boolean isValidation(String ipAdress){
        return Pattern.matches(IP_ADDRESS_CHECK,ipAdress);
    }

}
