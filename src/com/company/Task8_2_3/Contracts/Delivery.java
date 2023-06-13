package com.company.Task8_2_3.Contracts;

import com.company.Task8_2_3.Register;

import java.time.LocalDate;
import java.util.Date;

public class Delivery extends Register {

    public Delivery(int documentNumber, String typeOfProduct, int productsAmount, LocalDate documentDate) {
        super(documentNumber,typeOfProduct,productsAmount,documentDate);
    }

    public Delivery(){

    }

    @Override
    public String toString() {
        return "\nDocument Number:  "+getDocumentNumber()+"\n"+
                "Type Product: " +getTypeOfProduct()+"\n"+
                "Products Amount: "+getProductsAmount()+"\n"+
                "Document Date: "+getDocumentDate();
    }
}
