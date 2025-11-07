package com.juaracoding.labs.entity;

public class Cash extends Payment {
  
  public Cash(String id, int toBePaid, boolean isPaid) {
    super(id, toBePaid, isPaid);
    setPaymentType("Cash");
  }
}
