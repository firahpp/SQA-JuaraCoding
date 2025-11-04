package com.juaracoding.labs;

public class App {
  public static void main(String[] args) throws Exception {
    int i = 1;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }

    do {
      System.out.println("Ini dari do while, jalan dulu, dicek belakangan!");
      i++;
    } while(i <= 5);

    int y = 0;
    while (true) {
      System.out.println(y);
      y++;
      if (y > 5) {
        break;
      }

    }

    int x = 0;

    while (x <= 10) {
      x++;
      if (x % 2 != 0) { //angka genap yg habis dibagi 2 maka akan dicetak
        continue; //kalo angka ganjil maka tidak di cetak
      }
      System.out.println(x);
    }
  }
}
 