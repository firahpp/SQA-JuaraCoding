package com.juaracoding.labs.entity;

public class Payment {
    private String id;
    private int toBePaid;
    private boolean isPaid;
    private int bill;
    private String paymentType;

    public Payment(String id, int toBePaid, boolean isPaid) { //constructor
        this.id = id;
        this.toBePaid = toBePaid;
        this.isPaid = isPaid;
        this.bill = toBePaid;
    }

    public Payment() { //constructor kosongan
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getToBePaid() {
        return toBePaid;
    }

    public void setToBePaid(int toBePaid) {
        this.toBePaid = toBePaid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    public void pay (int total){
        if (total >= toBePaid) {
        bill = 0;
        setPaid(true);
    }
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
    
}
