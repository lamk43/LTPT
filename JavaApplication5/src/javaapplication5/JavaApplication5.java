/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author hoang
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hello("Lam"));
    }

    private static String hello(java.lang.String name) {
        tam.DichVu_Service service = new tam.DichVu_Service();
        tam.DichVu port = service.getDichVuPort();
        return port.hello(name);
    }
}
