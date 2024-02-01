/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg1.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium1Arraylist {

    /**
     * @param args the command line arguments
     */
    
    private void ArrLstA() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();

        System.out.print("Masukkan panjang Arraylist : ");
        int a = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan isi/elemen Arraylist ke " + i + " : ");
            String elemen = scan.nextLine();
            daftarNama.add(elemen);
        }
        
        System.out.println("\nDaftar Nama:");   // Menampilkan elemen-elemen dalam ArrayList
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
       
        System.out.println("\nElemen ke-2: " + daftarNama.get(1));   // Mengakses elemen berdasarkan indeks
        
        daftarNama.remove(0);
        System.out.println("\nSetelah menghapus elemen ke-1:");   // Menghapus elemen berdasarkan indeks
        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        System.out.println("Ukuran ArrayList: " + daftarNama.size());   // Menentukan ukuran ArrayList

        
        System.out.println("Apakah ArrayList kosong? " + daftarNama.isEmpty());   // Mengecek apakah ArrayList kosong
    }
    
    private void ArrLstB() {
        
    }
    
    public static void main(String[] args) {
        Medium1Arraylist obj = new Medium1Arraylist();
        obj.ArrLstA();
    }
}
