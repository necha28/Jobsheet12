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
public class latihan {
    public static void main(String[] args){
        System.out.println("Welcome to SMK Telkom Malang");
        
        int x = 10;
        int y = 20;
        int v = 30;
        int z = jumlah(x,y);
        double a = jumlah(x,y,v);
        System.out.println("hasil 1 " + z);
        System.out.println("hasil 2 " + a);
    }
    public static int jumlah (int a, int b){
        int hasil = a + b;
        return hasil;
    }
    private static double jumlah(int a, int b, int c){
        double hasil = a + b + c;
        return hasil;
    }
}

    
