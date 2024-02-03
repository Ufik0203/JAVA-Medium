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
            System.out.println("Pilihan : ");
            System.out.println("1. Input");
            System.out.println("2. Change/Update");
            System.out.println("3. Delete");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            a = scan.nextInt();
            scan.nextLine();
            cls();  // Implement how tp cls on java
            
            switch(a) {
                case 1:
                    System.out.println("\nPilih Inputan : ");
                    System.out.println("1. Auto key");    // Will give auto key input on hashmap
                    System.out.println("2. Manual key");    // Will give key input on hashmap when useer input the key
                    b = scan.nextInt();
                    scan.nextLine();
                    
                    switch(b) {
                        case 1:
                            System.out.print("Masukkan nilai Hashmap : ");
                            input = scan.nextLine();
                            map.put(auto++, input);
                            System.out.println(map);
                            break;
                        case 2:
                            System.out.print("Masukkan kunci Hashmap : ");
                            c = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.print("Masukkan nilai Hashmap : ");
                            input = scan.nextLine();
                            map.put(c, input);
                            System.out.println(map);
                            break;
                        default:
                            System.out.println("Inputan tidak valid");
                    }
                case 2:
                    System.out.println(/);
                
                case 3:
                    sa
                
                case 4:
                    System.out.println("\nTerima kasih");
                    z = false;
                    break;
                    
                default:
                    System.out.println("Inputan tidak valid");
            }
            
        } while(z);
          
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
