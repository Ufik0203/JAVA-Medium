/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg9.exception;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium9Exception {

    /**
     * @param args the command line arguments
     */
    
    private void exc() {
        Scanner scan = new Scanner(System.in);
        int a,b;
        boolean valid = true;

        do {
            System.out.println("\n1. Input hanya angka");
            System.out.println("2. Input bebas");
            System.out.print("Masukkan pilihan : ");
            a = scan.nextInt();
            
            switch(a) {
                case 1:
                    System.out.println("\n===> Inputan Wajib hanya angka !!! ");
                    System.out.print("\nMasukkan angka : ");
                    try {
                        b = scan.nextInt();
                        System.out.println("Hasil Inputan = " + b);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("\n===> Inputan bebas");
                    System.out.print("\nMasukkan Inputan : ");
                    String c = scan.nextLine();
                    System.out.println("Hasil Inputan = " + c);
                    break;
            }
        } while (valid);
    }
    
    public static void main(String[] args) {
        Medium9Exception obj = new Medium9Exception();
        obj.exc();
    }
    
}
