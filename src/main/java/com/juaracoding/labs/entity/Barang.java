package com.juaracoding.labs.entity;

public class Barang {
    private String kodeBarang;
    private String nama;
    private int harga;
    private int stok;

      //getter and setter -> buat bikin otomatis, klik kanan > source action > generate getter and setter
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

  
    
}
