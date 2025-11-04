//looping

package com.juaracoding.labs;


public class App {

  public static void main(String[] args) throws Exception {
   
    for (int i = 1; i <= 5; i++) {

        int jumlah = 2;
        int hargaSatuan = 120_000 * i;
        int total = jumlah * hargaSatuan;

        String struk = """
           ==================================
                 MINI MARKET JAYA ABADI
            ==================================
            Nomor Transaksi : TRX%04d
            No. Pelanggan : CST%04d
            
            Jumlah    : %d
            Harga     : Rp %,d
            ----------------------------------
            TOTAL     : Rp %,d
            
            Terima kasih!
            ==================================

          """.formatted(i, i, i, hargaSatuan, total);
          System.out.println(struk);
  }
 
/*
 * sebelum loopingnya dijalankan, i = 1 dijalankan terlebih dahulu
 * 
 */
  }
}