package com.company.Task8_2_3;

import com.company.Task8_2_3.Contracts.Delivery;
import com.company.Task8_2_3.Contracts.Employee;
import com.company.Task8_2_3.Finance.ConsignmentNote;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Register deliveryDocument1= new Delivery(1,
                "Glass",
                3000,
                LocalDate.of(2023,11,20));

        Register employeeDocument1= new Employee(2,
                LocalDate.of(2023,06,13),
                LocalDate.of(2023,12,30),
                "Smith Smith");

        Register consignmentNote1 = new ConsignmentNote(3,
                LocalDate.of(2022,04,15),
                2500.50,
                50);


        deliveryDocument1.saveDocuments(deliveryDocument1);
        deliveryDocument1.printInfoDocuments(1);
        employeeDocument1.saveDocuments(employeeDocument1);
        employeeDocument1.printInfoDocuments(2);
        consignmentNote1.saveDocuments(consignmentNote1);
        consignmentNote1.printInfoDocuments(3);

    }
}
