package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.juaracoding.labs.entity.Barang;
import com.juaracoding.labs.entity.Customer;
import com.juaracoding.labs.entity.DetailPesanan;
import com.juaracoding.labs.entity.Pesanan;
import com.juaracoding.labs.entity.userTest;

public class App {
  public static void main(String[] args) throws Exception {

    userTest userTest = new userTest();
    userTest.setName("Jono");
    userTest.setAlamat("Cibatu");
    userTest.setNomorHP("0799345566");
   
  
  System.out.println("Hai: "+ userTest.getName());
  System.out.println("Alamat kamu di : "+ userTest.getAlamat());
  System.out.println("Nomor HP kamu : " + userTest.getNomorHP() );

  }
}
  
