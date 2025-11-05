package com.juaracoding.labs;

import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {
   int[][] belanja = {
    {10, 10000, 0, 15000, 0},
    {23, 24000, 0, 5000, 0},
    {11, 14000, 0, 0, 0}
   };
   
   int i = 0;
    int total = 0;

    for (int[] items: belanja) {
      belanja[i][2] = items[0] * items[1];
      belanja[i][4] = belanja[i][2] - items[3]; 
      total = total + belanja[i][4];
      i++;
    }

    System.out.println("Data Belanja : " + Arrays.deepToString(belanja));
    System.out.println("Total Rp. " + total);

  }
}
  
