package com.juaracoding.labs.entity;

public class Pesanan {
    private String kodePesan;
    private int total;
    private Voucher voucher;
    private Customer customer;
    private int totalAfterDiscount;
    
    public String getKodePesan() {
        return kodePesan;
    }
    public void setKodePesan(String kodePesan) {
        this.kodePesan = kodePesan;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public Voucher getVoucher() {
        return voucher;
    }
    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getTotalAfterDiscount() {
        return totalAfterDiscount;
    }
    public void setTotalAfterDiscount(int totalAfterDiscount) {
        this.totalAfterDiscount = totalAfterDiscount;
    }
    
}
