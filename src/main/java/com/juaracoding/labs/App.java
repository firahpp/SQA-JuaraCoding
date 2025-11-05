package com.juaracoding.labs;

public class App {
  public static void main(String[] args) throws Exception {
    int[] nilaiPeserta = {1, 4, 6, 8, 1};
    //                    0  1  2  3  4
    System.out.println(nilaiPeserta[0]);
    // System.out.println(nilaiPeserta[6]); // error: diluar jangkauan

    int[] komplekDinas = new int[5];
    komplekDinas[0] = 3;
    komplekDinas[1] = 2;
    komplekDinas[2] = 10;
    komplekDinas[3] = 1;
    komplekDinas[4] = 15;
    
    System.out.println(komplekDinas[2]);

    System.out.println("Perulangan dengan array");
    for (int i = 0; i < komplekDinas.length; i++) {
      System.out.println(komplekDinas[i]);
    }

  }
}
  
