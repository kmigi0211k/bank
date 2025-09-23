package com.appbank.mi_appbank.model;

public class Money {
    private double amount;
    private String currency;



    public Money() {
    }



    //Getters y Setters
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }



    public double getAmount() {
        return amount;
    }



    public void setAmount(double amount) {
        this.amount = amount;
    }



    public String getCurrency() {
        return currency;
    }



    public void setCurrency(String currency) {
        this.currency = currency;
    }


    

    

    

}
