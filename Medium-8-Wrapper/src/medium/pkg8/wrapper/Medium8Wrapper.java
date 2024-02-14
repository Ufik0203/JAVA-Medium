/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medium.pkg8.wrapper;

/**
 *
 * @author mario
 */
public class Medium8Wrapper {

    /**
     * @param args the command line arguments
     */
    
    private void wrap1() {
        System.out.println("\n===== wrap1 =====");
        int test1 = 10000;
        
        String test01 = Integer.toString(test1);
        int digit = test01.length();
        System.out.println("Nilai = " + test01 + " digit = " + digit);
    }
    
    private void wrap2() {
        System.out.println("\n===== wrap2 =====");
        double Test2 = 0.0012;
        String test02 = Double.toString(Test2);
        int digit = test02.length();
        System.out.println("Nilai = " + test02 + " digit = " + digit);
    }
    
    private void wrap3() {
        System.out.println("\n===== wrap3 =====");
        int a = 12345;
        double b = 1.5;
        
        String stra = String.valueOf(a);
        System.out.println(stra);
        
        String strb = String.valueOf(b);
        System.out.println(strb);
    }
    
    public static void main(String[] args) {
        Medium8Wrapper obj = new Medium8Wrapper();
        obj.wrap1();
        obj.wrap2();
        obj.wrap3();
    }
    
}
