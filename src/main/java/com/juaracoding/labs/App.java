package com.juaracoding.labs;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        String dbEmail = "markonah@gmail.com";
        String dbPassword = "c4y4nkc3l4loe";
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Login here...");
        
        System.out.print("email \t\t: ");
        String email = scanner.nextLine();
    
        System.out.print("password \t: ");
        String password = scanner.nextLine();
    
        boolean hasil = email.equals(dbEmail) && password.equals(dbPassword);
        
        if (hasil) {
          System.out.println("Test success");
        } else {
          throw new Exception("Testing gagal!"); //untuk melempar langsung kalo salah
        }
    }

}