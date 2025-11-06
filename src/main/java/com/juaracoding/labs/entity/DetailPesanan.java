package com.juaracoding.labs.entity;

public class DetailPesanan {
    private Barang barang;
    private Pesanan pesanan;
    private int qty;
    
    public Barang getBarang() {
        return barang;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public Pesanan getPesanan() {
        return pesanan;
    }
    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
