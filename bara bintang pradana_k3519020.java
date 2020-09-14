/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo;

/**
 *
 * @author User
 */
public class keramik {
    /* atribut */
    /* satuan m dibuat menjadi cm */
    
    int luas = 1000*1000;
    int box;
    int ukuran;
    int rupiah;
    
    /*methods*/
    void hitungJumlah(){
        int jumlah;
        jumlah = this.luas/this.ukuran;
        System.out.println("jumlah keramik: " +jumlah+ "buah");
}
    void jumlahKerdus(){
         int kerdus;
         kerdus = (this.luas/this.ukuran)/this.box;
         System.out.println("jumlah box: " +kerdus+ "pcs");
}
    void totalHarga(){
         int harga;
         harga = ((this.luas/this.ukuran)/this.box)*this.rupiah;
         System.out.println("total harga: " + "Rp" +harga);
}
        
}
