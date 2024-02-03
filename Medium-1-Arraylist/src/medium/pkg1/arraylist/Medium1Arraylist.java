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
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Masukkan panjang Arraylist : ");
        int a = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan isi/elemen Arraylist ke " + i + " : ");
            String elemen = scan.nextLine();
            list.add(elemen);
        }
        
        System.out.println("\nDaftar Nama:");   // Menampilkan elemen-elemen dalam ArrayList
        for (String nama : list) {
            System.out.println(nama);
        }
       
        System.out.println("\nElemen ke-2: " + list.get(2));   // Mengakses elemen berdasarkan indeks
        
        list.remove(0);
        System.out.println("\nSetelah menghapus elemen ke-0:");   // Menghapus elemen berdasarkan indeks
        for (String nama : list) {
            System.out.println(nama);
        }

        System.out.println("Ukuran ArrayList: " + list.size());   // Menentukan ukuran ArrayList

        
        System.out.println("Apakah ArrayList kosong? " + list.isEmpty());   // Mengecek apakah ArrayList kosong
    }
    
    private void ArrLstB() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(1);
        int c,d,e,f;
        
        System.out.println("\n\n====== New ======");
        System.out.print("Masukkan panjang Arraylist : ");
        int a = scan.nextInt();
        scan.nextLine();
        
        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan isi/elemen Arraylist ke " + i + " : ");
            String elemen = scan.nextLine();
            list.add(elemen);
        }
        
        System.out.println("\nIsi/elemen Arraylist : ");
            for (String var : list) {
                System.out.println(var);
            }
            
        System.out.println("\nIngin menampilkan berserta nomer Indeks ?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        e = scan.nextInt();
        switch(e) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Indeks ke-" + (i + 1) + " = " + list.get(i));
                }
                break;
            case 2:
                break;
            default:
                System.out.println("Inputan tidak valid");
                break;
        }
        
        boolean b = true;
        
        do {
            System.out.println("\nApakah ingin menghapus atau mengubah elemen ?");
            System.out.println("1. Hapus");
            System.out.println("2. Ubah");
            System.out.println("3. Tidak");
            c = scan.nextInt();

            switch (c) {
                case 1:
                    System.out.println("\nElemen keberapa yang ingin anda hapus ?");
                    d = scan.nextInt();
                    if (d >= 1 && d <= list.size()) {
                        list.remove(d - 1);
                    } else {
                        System.out.println("Out of range");
                        b = false;
                        break;
                    }
                    System.out.println("\nIsi/elemen Arraylist setelah hapus : ");
                    for (String var : list) {
                        System.out.println(var);
                    }
                    System.out.println("\nApakah anda ingin menghapus lagi ?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    e = scan.nextInt();
                    scan.nextLine();

                    switch (e) {
                        case 1:
                            c = 1;
                            break;
                        case 2:
                            c = 0;
                            break;
                        default:
                            System.out.println("Inputan tidak valid");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Elemen keberapa yang ingin anda hapus ?");
                    f = scan.nextInt();
                    scan.nextLine();
                    System.out.print("\nMasukkan inputan ubah : ");
                    String ubah = scan.nextLine();
                    list.set((f - 1), ubah);
                    
                    System.out.println("Isi ArrayList setelah update : ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("Indeks ke-" + (i+1) + " : " + list.get(i));
                    }
                    
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    b = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        } while (b);
    }
    
    public static void main(String[] args) {
        Medium1Arraylist obj = new Medium1Arraylist();
        obj.ArrLstA();
        obj.ArrLstB();
    }
}
