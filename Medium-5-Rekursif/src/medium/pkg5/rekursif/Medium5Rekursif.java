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
    
    private static boolean prima (int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private void rks() {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        boolean valid = true;
        do {
            System.out.println("\n\n1. Cek ganjil/Genap");
            System.out.println("2. Cek apakah bilangan prima/tidak");
            System.out.println("3. Keluar");
            System.out.println("Masukkan pilihan : ");
            a = scan.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Inputkan angka : ");
                    b = scan.nextInt();
                    if (b % 2 == 0) {
                        System.out.println(" Genap");
                    } else {
                        System.out.println(" Ganjil");
                    }
                    
                    a = 0;
                break;
                
                case 2:
                    System.out.println("Inputkan angka : ");
                    c = scan.nextInt();
                    if (prima(c)) {
                        System.out.println(" Prima");
                    } else {
                        System.out.println(" Bukan prima");
                    }
                break;
                
                case 3:
                    System.out.println("Terima kasih");
                    valid = false;
                    break;
            }
        } while (valid);
    }
    
    public static void main(String[] args) {
        Medium5Rekursif obj = new Medium5Rekursif();
        
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("\nMasukkan nilai ke-1 : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan nilai ke-2 : ");
        b = scan.nextInt();
        
        c = tambah(a, b);
        System.out.println("\nHasil nya adalah " + c);
        
        obj.rks();
    }
    
}
