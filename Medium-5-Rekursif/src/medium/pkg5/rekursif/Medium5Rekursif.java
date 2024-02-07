/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg5.rekursif;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium5Rekursif {

    /**
     * @param args the command line arguments
     */
    
    private static int tambah (int a, int b) {  // simple implements for rekursif
        return a + b;
    }
    
    private void rks() {
        Scanner scan = new Scanner(System.in);
        int a;
        boolean valid = true;
        
        System.out.println("1. Cek ganjil/Genap");
        System.out.println("2. Cek apakah bilangan prima/tidak");
        System.out.println("Masukkan pilihan : ");
        do {
            
        } while (valid);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("\nMasukkan nilai ke-1 : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan nilai ke-2 : ");
        b = scan.nextInt();
        
        c = tambah(a, b);
        System.out.println("\nHasil nya adalah " + c);
    }
    
}
