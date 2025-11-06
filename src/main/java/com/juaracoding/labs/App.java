package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.juaracoding.labs.entity.Barang;
import com.juaracoding.labs.entity.Customer;
import com.juaracoding.labs.entity.DetailPesanan;
import com.juaracoding.labs.entity.Pesanan;

public class App {
  public static void main(String[] args) throws Exception {
   
     Barang barang = new Barang();

    // set data barang dari objek "barang"
    barang.setKodeBarang("BRG001");
    barang.setNama("Barang 01");
    barang.setHarga(15000);
    barang.setStok(100);
    
   Barang barang002 = new Barang();
   barang002.setKodeBarang("BRG002");
   barang002.setNama("Barang 02");
   barang002.setHarga(25000);
   barang002.setStok(10);

   // Buat customer
    Customer customer = new Customer();
    customer.setKodeCustomer("CST001");
    customer.setNamaCustomer("Bpk. Sarifudin");
    customer.setNomorHPCustomer("08976654421");
    customer.setAlamatCustomer("Jakarta Selatan");

    //customer melakukan pesanan 
    Pesanan pesanan001 = new Pesanan();
    pesanan001.setKodePesan("PSN");
    pesanan001.setCustomer(customer);
    
    //detail pesanan
    DetailPesanan detailPesanan = new DetailPesanan();
    detailPesanan.setBarang(barang);
    detailPesanan.setBarang(barang002);
    detailPesanan.setPesanan(pesanan001);
  }
}
  
