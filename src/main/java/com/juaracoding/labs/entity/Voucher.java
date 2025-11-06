package com.juaracoding.labs.entity;

public class Voucher {
    private String kodeVoucher;
    private int hargaPotongan;
    private boolean isActive;
    
    public String getKodeVoucher() {
        return kodeVoucher;
    }
    public void setKodeVoucher(String kodeVoucher) {
        this.kodeVoucher = kodeVoucher;
    }
    public int getHargaPotongan() {
        return hargaPotongan;
    }
    public void setHargaPotongan(int hargaPotongan) {
        this.hargaPotongan = hargaPotongan;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
