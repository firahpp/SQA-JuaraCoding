package com.juaracoding.labs;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App 
{
    public static int getRandomPrice(){
       // return ThreadLocalRandom.current().nextInt(100, 1000) * 1000; atau

         int hargaAwalAcak = ThreadLocalRandom.current().nextInt(100, 1000); //ambil angka random
         int hargaBulatPasti = hargaAwalAcak * 1000;
        return hargaBulatPasti;
         
    }
    public static void main(String[] args) {
        // int total = 140_000;
        // double discount = (double) 10/100;
        // double hargaPotongan = total * discount;
        // double hargaBayar = total - hargaPotongan;
        // System.out.println(hargaBayar);


        int hargaTotal =  getRandomPrice();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Harga Total: " + hargaTotal);

        System.out.print("Masukkan nama: ");
        String namaCustomer = scanner.nextLine();
        System.out.println("Nama customer adalah " + namaCustomer);

        //input discount
        System.out.print("Masukkan diskon: ");
        double diskon = scanner.nextDouble();
        diskon = diskon/100;
        double hargaPotongan = hargaTotal * diskon;
        System.out.println("Diskon "+ (diskon*100) + "%");
        System.out.println("Harga diskon : " + hargaPotongan);

        double hargaBayar = hargaTotal - hargaPotongan;
        System.out.println("Perlu di bayar = " + hargaBayar);
    }

}