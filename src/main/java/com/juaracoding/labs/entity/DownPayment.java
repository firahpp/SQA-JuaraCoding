package com.juaracoding.labs.entity;

public class DownPayment extends Payment {
   
    
    public DownPayment(String id, int toBePaid, boolean isPaid) {
    super(id, toBePaid, isPaid);
    setPaymentType("Down Payment");
  }

    @Override
    public void pay(int total) {
        if (getBill() > total) {
      setBill(getBill() - total);
    } else {
        setChange(total - getBill());
        setBill(0);
        setPaid(true);
    }

        // 120000
        // dp bill = 20000
        // bill 1 = 100000

        // pay = 70000;
        // bill 2 = 30000;

        // pay = 50000
        // bill 3 = bill - 50000;
    }
}
