package com.juaracoding.labs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class App {
  public static void main(String[] args) throws Exception {
   
    int[][] map2 = new int[4][4];

    for (int r = 0; r < map2.length; r++) {
      for (int c = 0; c < map2[r].length; c++) {
        map2[r][c] = ThreadLocalRandom.current().nextInt(0, 2);
      }
    }

   int diamond = 0;
   
   for (int[] i: map2){
    for (int c: i){
      if (c == 0) {
        diamond += 1;
      }

      if (c == 2) {
        diamond -= 1;
      }
    }
   }

   System.err.println(Arrays.deepToString(map2));
   System.out.println(diamond);
  //   int[][] belanja = {
  //   {10, 10000, 0, 15000, 0},
  //   {23, 24000, 0, 5000, 0},
  //   {11, 14000, 0, 0, 0}
  //  };
   
  //  int i = 0;
  //   int total = 0;

  //   for (int[] items: belanja) {
  //     belanja[i][2] = items[0] * items[1];
  //     belanja[i][4] = belanja[i][2] - items[3]; 
  //     total = total + belanja[i][4];
  //     i++;
  //   }

  //   System.out.println("Data Belanja : " + Arrays.deepToString(belanja));
  //   System.out.println("Total Rp. " + total);

  }
}
  
