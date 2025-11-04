package com.juaracoding.labs;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
// --- Setup Variabel ---
        int KERTAS = 0;
        int GUNTING = 1;
        int BATU = 2;

        System.out.print("Masukkan angka: (0) Kertas, (1) Gunting, (2) Batu \t");
        int playerChoice = scanner.nextInt(); // Input dari Anda (GUNTING)

        // Kita acak pilihan komputer (0, 1, atau 2)
        int computerChoice = ThreadLocalRandom.current().nextInt(0, 3);
        
        // Konversi angka ke teks agar mudah dibaca
        String[] pilihanTeks = {"Kertas", "Gunting", "Batu"};

        System.out.println("Player memilih: " + pilihanTeks[playerChoice]);
        System.out.println("Komputer memilih: " + pilihanTeks[computerChoice]);
        System.out.println("---");

if (playerChoice == computerChoice) {
            System.out.println("Hasil 2: SERI!");
        } 
        else if ( playerChoice == (computerChoice + 1) % 3 ) {
            System.out.println("Hasil 2: Player MENANG!");
        } 
        else {
            System.out.println("Hasil 2: Player KALAH!");
        }


  }
}
  
