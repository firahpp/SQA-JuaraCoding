package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.juaracoding.labs.entity.Barang;
import com.juaracoding.labs.entity.Customer;
import com.juaracoding.labs.entity.DetailPesanan;
import com.juaracoding.labs.entity.Pesanan;
import com.juaracoding.labs.entity.User;
import com.juaracoding.labs.entity.userTest;

public class App {
  public static void main(String[] args) throws Exception {


    User budi = new User(1, "Budi Laksono", "budilaksono@mail.com");

    System.out.println(budi.getId());
    System.out.println(budi.getNama());
    System.out.println(budi.getEmail());

    budi.setNama("Budi Andika");
    System.out.println(budi.getNama());

    User mia = new User();
    mia.setId(2);
    mia.setNama("Mia Nursakinah");
    mia.setEmail("mianur@mail.com");

    User udin = new User(3);
    udin.setNama("Udin Portal");
    udin.setEmail("udinportalizm@mail.com");
  }
}
  
