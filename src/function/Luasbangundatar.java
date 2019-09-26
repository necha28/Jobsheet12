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
public class Luasbangundatar {
    public static void main(String[] args){
        System.out.println("Luas Persegi " + persegi());
        System.out.println("Luas PersegiPanjang " + persegipanjang());
        System.out.println("Luas Lingkaran " + lingkaran());
        System.out.println("Luas Segitiga " + segitiga(9, 30));
    }
    public static double persegi(){
        int s = 10;
        double hasil = s*s;
        return hasil;
    }
    public static double persegipanjang(){
        int pi = 10;
        int l = 20;
        double hasil = pi*l;
        return hasil;
    }
    public static double lingkaran(){
        double p = 3.14;
        int r = 10;
        double hasil = p*r*r;
        return hasil;
    }
    public static double segitiga(int a, int b){
        double hasil = 0.5*a*b;
        return hasil;
    }
}