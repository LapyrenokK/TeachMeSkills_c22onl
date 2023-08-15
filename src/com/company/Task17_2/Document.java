package com.company.Task17_2;

import java.util.ArrayList;
import java.util.List;


public class Document {

    private String numberDoc;
    private String phoneNumber;
    private String email;
    private List<Document> documents = new ArrayList<>();

    public Document(String numberDoc, String phoneNumber, String email) {
        this.numberDoc = numberDoc;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNumberDoc() {
        return numberDoc;
    }

    public void setNumberDoc(String numberDoc) {
        this.numberDoc = numberDoc;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "{ numberDoc='" + numberDoc + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
