/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan6kambingstaticdankonstanta;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program :Kambing static dan konstanta
 */
public class IF110118021Latihan6KambingStaticdanKonstanta {
    //NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "NANANG";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + Mamalia.jumlahKambing);
    }
    
}
