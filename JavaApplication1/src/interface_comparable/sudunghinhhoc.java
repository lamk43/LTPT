/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_comparable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class sudunghinhhoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        try {
            
            // CIRCLE
            System.out.println("CIRCLE");
            Circle[] cir = new Circle[10];
            for(int i=0; i<cir.length; i++) {
                System.out.println("-----" + (i+1) + "-----");
                cir[i] = new Circle(rand.nextDouble(5, 25));
                System.out.println(cir[i]);
            }
            System.out.println("________________________________________");
            System.out.println();

            // RECTANGLE
            System.out.println("RECTANGLE");
            Rectangle[] rec = new Rectangle[10];
            for(int i=0; i<rec.length; i++) {
                System.out.println("-----" + (i+1) + "-----");
                rec[i] = new Rectangle(rand.nextDouble(1, 15), rand.nextDouble(20, 35));
                System.out.println(rec[i]);
            }
            System.out.println("________________________________________");
            System.out.println();
            
            // Arrays.sort()
            System.out.println("SAP XEP");
            Arrays.sort(cir);
            Arrays.sort(rec);
            System.out.println(Arrays.toString(cir));
            System.out.println("---------------");
            System.out.println(Arrays.toString(rec));
            
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}