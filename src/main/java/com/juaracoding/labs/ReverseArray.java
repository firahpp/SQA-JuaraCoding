package com.juaracoding.labs;

public class ReverseArray {
    //untuk menjalankan code ini, project di POM ganti dulu nama file nya
    public static void main(String[] args) {
        int[][] map = {
            { 1, 10, 5, 4 },
            { 4, 6, 4, 7 },
          };
      
          System.out.println("Mencetak nilai dari belakang ke depan:");
      
          // Loop untuk baris, mulai dari baris terakhir (indeks map.length - 1)
          for (int i = map.length - 1; i >= 0; i--) {
              // Loop untuk kolom, mulai dari kolom terakhir (indeks map[i].length - 1)
              for (int j = map[i].length - 1; j >= 0; j--) {
                  System.out.println(map[i][j]);
              }
          }
    }
}
