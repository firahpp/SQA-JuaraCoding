package com.juaracoding.labs;

public class App {
  public static void main(String[] args) throws Exception {
    int[] subtotal = {
      30000,
      15000,
      12000,
      50500,
      123000
    };
    int total = 0;

    //perulangan iterasi item array versi old
    // for (int i = 0; i < subtotal.length; i++){
    //   total = total + subtotal[i];
    // }

    //iterasi item array modern

    for (int harga: subtotal){
      total = total + harga;
    }

    System.out.println("Total: " + total);
  }
}
  
