package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.juaracoding.labs.entity.Barang;

public class App {
  public static void main(String[] args) throws Exception {
   
     Barang barang = new Barang();

    // set data barang dari objek "barang"
    barang.setKodeBarang("BRG001");
    barang.setNama("Barang 01");
    barang.setHarga(15000);
    barang.setStok(100);
    
    System.out.println("Kode Barang: " + barang.getKodeBarang());
    System.out.println("Nama Barang: " + barang.getNama());
    System.out.println("Harga Barang: " + barang.getHarga());
    System.out.println("Stok Barang: " + barang.getStok());

  }
}
  
