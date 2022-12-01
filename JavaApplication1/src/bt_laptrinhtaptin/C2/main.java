/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_laptrinhtaptin.C2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class main {
    
    public static void ghiFile(Student[] s) {
        try {
            FileOutputStream fileOut = new FileOutputStream("./src/bt_laptrinhtaptin.C2/student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Student item : s) {
                out.writeObject(item);
            }

            out.close();
            fileOut.close();
            System.out.println("Save object successfully!");
            
        } catch(IOException e) {
            System.out.println(e); 
        }
        
    }
    
    public static void docFile(Student[] s) {
        try{
            FileInputStream fileInput = new FileInputStream("./src/bt_laptrinhtaptin.C2/student.txt");
            ObjectInputStream input = new ObjectInputStream(fileInput);
            
            //readObject trả về một Object nên cần ép về kiểu Student
            for(int i=0; i<s.length; i++) s[i] = (Student) input.readObject();

            //Hiện thông tin
            System.out.println("Read object from File:");
            for (Student item : s) {
                System.out.println(item);
            }
            
        } catch(IOException | ClassNotFoundException e){}
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Nhập số lượng sinh viên : ");
            int sl = input.nextInt();
            input.nextLine();
            Student[] st = new Student[sl];
            
            for(int i=0; i<sl; i++) {
                System.out.println("-----Sinh Viên" + (i+1) + "-----");
                int id = i+1;
                System.out.println("ID : " + id);
                System.out.print("Nhập Tên : ");
                String name = input.nextLine();
                System.out.print("Nhập SDT : ");
                String sdt = input.nextLine();
                System.out.print("Nhập Email : ");
                String email = input.nextLine();
                System.out.println();
                
                st[i] = new Student(name, id, sdt, email);
            }
            
            // Ghi file
            ghiFile(st);
            System.out.println();
            
            // Đọc file
            docFile(st);
            
            
        } catch(Exception e) {
            
        }
    }
}
