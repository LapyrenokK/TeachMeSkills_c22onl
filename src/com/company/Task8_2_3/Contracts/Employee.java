package com.company.Task8_2_3.Contracts;

import com.company.Task8_2_3.Register;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Register {

    public Employee(int documentNumber, LocalDate documentDate, LocalDate contractEndDate, String name) {
        super(documentNumber, documentDate, contractEndDate, name);
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "\nDocument Number:  "+getDocumentNumber()+"\n"+
                "Contract End Date: " +getContractEndDate()+"\n"+
                "Name: "+getName()+"\n"+
                "Document Date: "+getDocumentDate();
    }
}
