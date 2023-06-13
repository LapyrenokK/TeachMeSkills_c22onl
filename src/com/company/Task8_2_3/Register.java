package com.company.Task8_2_3;

import java.time.LocalDate;

public class Register {

    private int documentNumber;
    private String typeOfProduct;
    private int productsAmount;
    private LocalDate documentDate;
    private LocalDate contractEndDate;
    private String name;
    private double totalAmountForTheMonth;
    private int departmentCode;

    Register[]registers = new Register[10];

    public int getDocumentNumber() {
        return documentNumber;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getProductsAmount() {
        return productsAmount;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public String getName() {
        return name;
    }

    public double getTotalAmountForTheMonth() {
        return totalAmountForTheMonth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public Register(){

    }


    public Register(int documentNumber, String typeOfProduct, int productsAmount, LocalDate documentDate) {
        this.documentNumber = documentNumber;
        this.typeOfProduct = typeOfProduct;
        this.productsAmount = productsAmount;
        this.documentDate = documentDate;
    }

    public Register(int documentNumber, LocalDate documentDate, LocalDate contractEndDate, String name) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.contractEndDate = contractEndDate;
        this.name = name;
    }

    public Register(int documentNumber, LocalDate documentDate, double totalAmountForTheMonth, int departmentCode) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.totalAmountForTheMonth = totalAmountForTheMonth;
        this.departmentCode = departmentCode;
    }

    public Register saveDocuments(Register register){
    registers[documentNumber-1]=register;
    return register;
    }

    public void printInfoDocuments(int documentNumbers){
        System.out.println(registers[documentNumbers-1]);
    }


}
