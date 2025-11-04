package com.juaracoding.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    
    int harga = 10000;
    int uang = 5000;

    if (uang >= harga) {
      System.out.println("Saya bisa beli produk tersebut");
    } else {
      System.out.println("Saya tidak bisa beli produk tersebut");
    }

    System.out.println("Ini perintah berikutnya.");

    String validUsername = "uus";
    String validPassword = "123qwe";

    String usernameDariUser = "oncom";
    String passwordDariUser = "123qwa";

    if (usernameDariUser.equals(validUsername)) {
      if (passwordDariUser.equals(validPassword)) {
        System.out.println("Login berhail");
      } else {
        System.out.println("Maaf password tidak valid.");
      }
    } else {
      System.out.println("Maaf username tidak valid.");
    }
    
    try {
      System.out.print("Masukkan nilai peserta: ");
      int nilaiPeserta = scanner.nextInt();

      if (nilaiPeserta == 0) {
        System.out.println("Nilai peserta tidak boleh kosong");
      } else {
        int nilaiA = 90;
        int nilaiB = 83;
        int nilaiC = 70;
        int nilaiD = 60;
        
        if (nilaiPeserta >= nilaiA) {
          System.out.println("Dapet A");
        } else if (nilaiPeserta >= nilaiB) {
          System.out.println("Dapet B");
        } else if (nilaiPeserta >= nilaiC) {
          System.out.println("Dapet C");
        } else if (nilaiPeserta >= nilaiD) {
          System.out.println("Dapet D");
        } else {
          System.out.println("Dapet E");
        }
      }
    } catch (InputMismatchException e) { //untuk menangkap kalau ada penulisan yang tidak sesuai
      System.out.println("Ups terjadi masalah!");
      System.out.println(e.getMessage());
    }
    
  }
}