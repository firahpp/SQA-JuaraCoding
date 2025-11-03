package com.juaracoding.labs;


public class App {
    public static void main(String[] args) {
      /**
       * Implicit casting (casting otomatis)
       */
      // int i = 124_000_000; // kapasitas int di i, ukurannya lebih kecil dari kapasitas long di l.
      // long l = i;

      // System.out.println(i);
      // System.out.println(l);

      // /**
      //  * Explicit casting
      //  */
      // short s = 100;
      // byte b = (byte) s;
      // System.out.println(s);
      // System.out.println(b);

      // int num1 = 10;
      // int num2 = 20;
      // double num3 = num1 / (double) num2;
      // System.out.println(num3);

      // int num4 = num1%3;
      // System.out.println(num4);

      // increment
      // int x = 10;
      // System.out.println(x++); // Pakai Dulu x nya, Baru Tambah x nya dengan 1

      // int c = 1;
      // System.out.println(++c); // Tambah dulu c nya, baru pakai (cetak)
      // System.out.println(x);

      int total = 140_000;
      double discount = (double) 10/100;
      double hargaPotongan = total * discount;
      double hargaBayar = total - hargaPotongan;
      System.out.println(hargaBayar);
    }
}