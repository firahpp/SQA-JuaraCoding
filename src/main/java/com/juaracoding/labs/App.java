package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.juaracoding.labs.entity.Barang;
import com.juaracoding.labs.entity.Cash;
import com.juaracoding.labs.entity.Customer;
import com.juaracoding.labs.entity.DetailPesanan;
import com.juaracoding.labs.entity.DownPayment;
import com.juaracoding.labs.entity.Payment;
import com.juaracoding.labs.entity.Pesanan;
import com.juaracoding.labs.entity.User;
import com.juaracoding.labs.entity.userTest;

public class App {
  public static void main(String[] args) throws Exception {

    Cash cash = new Cash("PAY-001",20000, false);
    cash.pay(25000);

    System.out.println("Bill Cash: " + cash.getBill());
    System.out.println("Bill Cash Is Paid? : " + cash.isPaid());

    DownPayment dp = new DownPayment("PAY-002", 120000, false);

    //pembayaran pertama
    dp.pay(60000);
    System.out.println("Bill DP: " + dp.getBill());
    System.out.println("Bill DP is Paid? : " + dp.isPaid());
  }
}
  
