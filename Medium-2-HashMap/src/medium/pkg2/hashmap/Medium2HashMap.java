/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg2.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium2HashMap {

    /**
     * @param args the command line arguments
     */
    
    private void hsmpA() {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();  // so the input for hashmap is String first then int or Integer
        boolean z = true;
        int a,b,c;
        int auto = 1;
        String input;
        
        do {
            System.out.println("\nPilihan : ");
            System.out.println("1. Input");
            System.out.println("2. Change/Update");
            System.out.println("3. Delete");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            a = scan.nextInt();
            scan.nextLine();
            cls();  // Implement how tp cls on java "JUST WORK IN VS CODE"
            switch (a) {
                case 1:
                    System.out.println("\nPilih Inputan : ");
                    System.out.println("1. Auto key");    // Will give auto key input on hashmap
                    System.out.println("2. Manual key");    // Will give key input on hashmap when useer input the key
                    b = scan.nextInt();
                    scan.nextLine();

                    switch (b) {
                        case 1:
                            System.out.print("Masukkan nilai Hashmap : ");
                            input = scan.nextLine();
                            map.put(auto++, input);
                            System.out.println("\n" + map);
                            break;
                        case 2:
                            boolean valid = false;

                            while (!valid) {
                                System.out.print("Masukkan kunci Hashmap : ");
                                if (scan.hasNextInt()) {
                                    c = scan.nextInt();
                                    scan.nextLine();

                                    System.out.print("Masukkan nilai Hashmap : ");
                                    input = scan.nextLine();
                                    map.put(c, input);
                                    System.out.println("\n" + map);
                                    valid = true;

                                } else {
                                    System.out.println("Inputan Kunci/Key harus berupa angka");
                                    scan.nextLine();
                                }
                            }
                            break;
                        default:
                            System.out.println("Inputan tidak valid");
                            break;
                    }
                    break;
                    
                case 2:
                    int key,nwk;
                    Map<Integer, String> newmp = new HashMap<>();
                    boolean valid = false;
                    if (!map.isEmpty()) {

                        System.out.println("\n\nIsi Hashmap :");
                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
                        }

                        System.out.println("\nIngin mengubah bagian apa ?");
                        System.out.println("1. Key/kunci saja");
                        System.out.println("2. Nilai/value saja");
                        System.out.println("3. Semua");
                        int choose = scan.nextInt();

                        switch (choose) {
                            case 1:
                                while (!valid) {
                                    System.out.print("\nMasukkan key yang ingin di ubah : ");
                                    key = scan.nextInt();
                                    scan.nextLine();

                                    if (map.containsKey(key)) {
                                        System.out.print("\nMasukkan key baru : ");
                                        nwk = scan.nextInt();
                                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                            if (entry.getKey() == key) {
                                                newmp.put(nwk, entry.getValue());
                                            } else {
                                                newmp.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        map.clear();
                                        map.putAll(newmp);
                                        valid = true;
                                    } else {
                                        System.out.println("Key tidak terdaftar!!!");
                                    }
                                }
                                break;

                            case 2:
                                while (!valid) {
                                    System.out.print("\nMasukkan key yang ingin di ubah : ");
                                    key = scan.nextInt();
                                    scan.nextLine();

                                    if (map.containsKey(key)) {
                                        System.out.print("\nMasukkan nilai yang baru : ");
                                        String value = scan.nextLine();
                                        map.replace(key, value);
                                        valid = true;
                                    } else {
                                        System.out.println("Key tidak terdaftar!!!");
                                    }
                                }
                                break;

                            case 3:
                                while (!valid) {
                                    System.out.print("\nMasukkan key mana yang ingin di ubah semua : ");
                                    key = scan.nextInt();
                                    scan.nextLine();

                                    if (map.containsKey(key)) {
                                        System.out.print("\nMasukkan key baru : ");
                                        nwk = scan.nextInt();
                                        scan.nextLine();

                                        System.out.print("\nMasukkan value baru : ");
                                        input = scan.nextLine();

                                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                            if (entry.getKey() == key) {
                                                newmp.put(nwk, input);
                                            } else {
                                                newmp.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        map.clear();
                                        map.putAll(newmp);
                                        valid = true;
                                    } else {
                                        System.out.println("Key tidak terdaftar!!!");
                                    }
                                }
                                break;
                        }
                    } else {
                        System.out.println("!!!!!!  Hashmap kosong  !!!!!!");
                    }
                    break;

                case 3:
                    if (!map.isEmpty()) {
                        valid = false;
                        while (!valid) {
                            System.out.println("Masukkan key mana yang ingin dihapus ? ");
                            key = scan.nextInt();
                            if (map.containsKey(key)) {
                                map.remove(key);
                                valid = true;
                            } else {
                                System.out.println("Data tidak terdaftar");
                            }
                        }
                        break;
                    } else {
                        System.out.println("!!!!!!  Data kosong  !!!!!!!");
                    }
                    break;

                case 4:
                    System.out.println("\nTerima kasih");
                    z = false;
                    break;

                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        } while (z);
          
    }
    
    private static void clear() {   // Clear terminal with prompt
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   // For netbeans it doesnt work
    
    private static void cls() {   // clear terminal with ANSI
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }   // For netbeans it doesnt work
    
    public static void main(String[] args) {
        Medium2HashMap obj = new Medium2HashMap();
        obj.hsmpA();
        
    }
    
}
