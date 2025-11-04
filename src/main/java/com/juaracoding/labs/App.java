package com.juaracoding.labs;


public class App {

  public static void main(String[] args) throws Exception {
   
     String namaPelanggan = "Citra Lestari";
        String item = "Kopi Robusta 500gr";
        int jumlah = 2;
        int hargaSatuan = 120_000;
        int total = jumlah * hargaSatuan;

        // Pakai Text Blocks (tanda kutip tiga kali) + .formatted()
        String struk = """
            ==================================
                 MINI MARKET JAYA ABADI
            ==================================
            Kode Transaksi: TRX%04d
            Pelanggan : %s
            
            Item      : %s
            Jumlah    : %d
            Harga     : Rp %,d
            ----------------------------------
            TOTAL     : Rp %,d
            
            Terima kasih!
            ==================================
            """.formatted(
            50,
            namaPelanggan, 
                          item, 
                          jumlah, 
                          hargaSatuan, 
                          total);

        System.out.println(struk);
  
    

  }
}