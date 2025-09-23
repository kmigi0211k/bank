package com.appbank.mi_appbank.model;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private Money amount;
    private String acountId;
    private LocalDateTime timestamp;

    public Transaction(LocalDateTime timestamp) {
     this.timestamp = timestamp;
    }

    public Transaction(String type, Money amount, String acountId) {
        this.type = type;
        this.amount = amount;
        this.acountId = acountId;
    
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getAcountId() {
        return acountId;
    }

    public void setAcountId(String acountId) {
        this.acountId = acountId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    

    


    

}
