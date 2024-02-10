/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg6.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Medium6Iterator {

    /**
     * @param args the command line arguments
     */
    
    /*private static Iterator<String> UpdtAndAdd(List<String> list, Iterator<String> iterator, String updt) {
    list.add(updt);
    return list.iterator();
    }*/
    
    private void arr() {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int a,b;
        boolean valid = true;
        String value;
        System.out.println("Ingin memasukkan berapa nilai ? ");
        a = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < a; i++) {
            System.out.println("Masaukkan nilai : ");
            value = scan.nextLine();
            list.add(value);
        }
        
        do {
        System.out.println(list);
        System.out.println("Ingin mengganti dengan nilai baru ? ");
        System.out.println("1. ya");
        System.out.println("2. Tidak");
        b = scan.nextInt();
            switch (b) {
                case 1:
                    ListIterator<String> iterator = list.listIterator();
                    System.out.println("Isi Arraylist saat ini :");
                    while (iterator.hasNext()) {
                        int index = iterator.nextIndex();
                        String currValue = iterator.next();
                        System.out.println(index + " : " + currValue);
                    }

                    ListIterator<String> newIterator = list.listIterator();
                    scan.nextLine();
                    while (newIterator.hasNext()) {
                        int index = newIterator.nextIndex();
                        newIterator.next();
                        System.out.println("Masukkan nilai baru : ");
                        String baru = scan.nextLine();
                        newIterator.set(baru);
                    }
                    
                    System.out.println("Data berhasil di update!");
                    break;

                case 2:
                    valid = false;
                    break;

                default:
                    System.out.println("Inputan tidak valid");

            }

        } while (valid);
    }
    
    public static void main(String[] args) {
        
        Medium6Iterator obj = new Medium6Iterator();
        
        obj.arr();
        
    }
    
}
