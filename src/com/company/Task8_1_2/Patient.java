package com.company.Task8_1_2;

public class Patient {
    public Patient(int code) {
        if (code==1){
            new Surgeon().therat();
        }else if (code==2){
            new Dentist().therat();
        }else if(code==3) {
            new Therapist().therat();
        }else {
            System.out.println("No such doctor found");
        }
    }
}
