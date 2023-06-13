package com.company.Task8_2_3.Finance;

import com.company.Task8_2_3.Register;

import java.time.LocalDate;
import java.util.Date;

public class ConsignmentNote extends Register {

    public ConsignmentNote(int documentNumber, LocalDate documentDate, double totalAmountForTheMonth, int departmentCode) {
        super(documentNumber, documentDate, totalAmountForTheMonth, departmentCode);
    }
    public ConsignmentNote(){

    }

    @Override
    public String toString() {
        return  "\nDocument Number: " +getDocumentNumber()+"\n"+
                "Total Amount For The Month:  "+getTotalAmountForTheMonth()+"$\n"+
                "Department Code: "+getDepartmentCode()+"\n"+
                "Document Date: "+getDocumentDate();
    }
}
