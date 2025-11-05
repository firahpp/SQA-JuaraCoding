package com.juaracoding.labs;

public class App {
  public static void main(String[] args) throws Exception {
    int[][] map = {
      { 1, 10, 5, 4 },
      { 4, 6, 4, 7 },
    };

    for (int[] row: map ) {
      for (int col: row) {
        System.out.println(col);
      }
    }

    
  }
}
  
