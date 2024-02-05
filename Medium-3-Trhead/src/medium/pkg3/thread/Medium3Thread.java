/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg3.thread;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Medium3Thread {

    /**
     * @param args the command line arguments
     */
    
    private void trh() {
        Scanner scan = new Scanner(System.in);
        int a,b;
        boolean valid = true;
        
        do {
            System.out.println("\n1. Hitung mundur");
            System.out.println("2. Hitung maju");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            a = scan.nextInt();
            scan.nextLine();
            
            switch (a) {
                case 1:
                    System.out.print("\nMasukkan angka : ");
                    if (scan.hasNextInt()) {
                        b = scan.nextInt();
                        final int fnlB = b;
                        scan.nextLine();
                        System.out.println("\nHitung mundur dimulai....");
                        Thread t1 = new Thread(new Runnable() {
                            int i;

                            @Override
                            public void run() {
                                try {
                                    for (i = fnlB; i >= 1; i--) {
                                        System.out.println(i);
                                        Thread.sleep(1000);
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        t1.start();
                try {
                    t1.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Medium3Thread.class.getName()).log(Level.SEVERE, null, ex);
                }
                    } else {
                        System.out.println("Inputan harus berupa angka!!!");
                    }
                    break;
                
                case 2:
                    System.out.print("\nMasukkan angka : ");
                    if (scan.hasNextInt()) {
                        b = scan.nextInt();
                        final int fnlB = b;
                        System.out.println("Hitungan dimulai dari angka 1....");
                        Thread t1 = new Thread(new Runnable() {
                            int i;
                            
                            @Override
                            public void run() {
                                try {
                                    for (i = 1; i <= fnlB; i++) {
                                        System.out.println(i);
                                        Thread.sleep(1000);
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        t1.start();
                try {
                    t1.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Medium3Thread.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        Medium3Thread obj = new Medium3Thread();
        obj.trh();
    }
    
}
