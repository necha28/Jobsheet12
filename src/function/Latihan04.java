/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author necha
 */
public class Latihan04 {
    public static double kecepatan(int jarak, int waktuTempuh){
    
        int hasil = jarak / waktuTempuh;
        
        return hasil;
}
    public static void main(String[] args){
        double x;
        int jarak = 100, waktuTempuh=2;
        x = (int) kecepatan(jarak, waktuTempuh);
        
        System.out.println("Masukkan jarak : " + jarak);
        System.out.println("Masukkan waktu tempuh : " + waktuTempuh);
        System.out.println("Kecepatan : " + x + "km/jam");
    }
}
