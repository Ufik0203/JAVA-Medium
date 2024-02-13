/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg7.setter.getter;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium7SetterGetter {

    /**
     * @param args the command line arguments
     */
    
    public static class Tambah {

        int a, b;

        private void setTambah(int a, int b) {
            this.a = a;
            this.b = b;
        }

        private int getTambah() {
            return a + b;
        }
    }

    public class Suara {

        private String motor, mobil;

        public String getMotor() {
            return motor;
        }

        public void setMotor(String motor) {
            this.motor = motor;
        }

        public String getMobil() {
            return mobil;
        }

        public void setMobil(String mobil) {
            this.mobil = mobil;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tambah jumlah = new Tambah();

        Medium7SetterGetter outerObject = new Medium7SetterGetter();
        Suara suara = outerObject.new Suara();

        int a, b;
        System.out.print("Masukkan inputan ke-1 : ");
        a = scan.nextInt();
        System.out.print("Masukkan inputan ke-2 : ");
        b = scan.nextInt();

        jumlah.setTambah(a, b);

        System.out.println("\nHasil = " + jumlah.getTambah());
        
        System.out.print("\nMasukkan suara motor: ");
        suara.setMotor(scan.next());
        scan.nextLine();
        System.out.print("Masukkan suara mobil: ");
        suara.setMobil(scan.next());

        System.out.println("\nSuara Motor: " + suara.getMotor());
        System.out.println("Suara Mobil: " + suara.getMobil());
    }
    
}