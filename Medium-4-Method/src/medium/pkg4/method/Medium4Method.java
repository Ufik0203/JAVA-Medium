/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg4.method;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium4Method {

    /**
     * @param args the command line arguments
     */
    
    private static void mtd(int a, String b) {
        System.out.println("\nInputan yang pertmana berupa INT : " + a);
        System.out.println("Inputan kedua berupa String : " + b);
    }
    
    private static int tambah (int a, int b) {
        return a + b;
    }
    
    private static void kurang (int a, int b) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nNilai ke-1 : ");
        a = scan.nextInt();
        System.out.print("Nilai ke 2 : ");
        b = scan.nextInt();
        scan.nextLine();
        
        System.out.println("\nHasil kurang dari " + a + " dan " + b + " adalah " + (a+b));
    }
    
    public static void main(String[] args) {
        Medium4Method obj = new Medium4Method();
        Scanner scan = new Scanner(System.in);
        int a,c;
        
        System.out.print("\nMasukkan Inputan Integer ke-1 : ");
        a = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Masukkan Inputan String : ");
        String b = scan.nextLine();
        
        System.out.print("\nMasukkan Inputan Integer ke -2 : ");
        c = scan.nextInt();
        
        int z = tambah(a, c);
        
        mtd(a, b);
        obj.kurang(a, c);
        System.out.println("\nHasil tambah dari inputan Integer ke-1 dan ke-2 adalah " + z);
    } 
}
