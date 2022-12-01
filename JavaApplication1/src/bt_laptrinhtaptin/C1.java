
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_laptrinhtaptin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lam
 */
public class C1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        try {
            // Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fOut = new FileOutputStream("./src/bt_laptrinhtaptin/cau1.txt");
            DataOutputStream dos = new DataOutputStream(fOut);
            
            FileInputStream fIn = new FileInputStream("./src/bt_laptrinhtaptin/cau1.txt");
            DataInputStream dis = new DataInputStream(fIn);
            
            // Độ dài mảng ngẫu nhiên từ 1-50
            int len = rand.nextInt(1, 50);
            double arr[] = new double[len];
            // Gắn các phần tử ngẫu nhiên cho mảng và ghi
            for(int i=0; i<len; i++) {
                arr[i] = rand.nextDouble();
                dos.writeDouble(arr[i]);
            }
            
            // Nhập chuỗi và ghi chuỗi
            System.out.print("Nhập 1 chuỗi : ");
            String str = input.nextLine();
            System.out.println();
            byte b[] = str.getBytes();
            fOut.write(b);
                
            System.out.println("Save data successfully!");
            System.out.println();
            fOut.close();
            dos.close();
            
            
            // Đọc file
            System.out.println("Read data from File :");
            for(int i=0; i<len; i++) {
                double m = dis.readDouble();
                System.out.println(m);
            }
            
            int i=0;
            while ((i = fIn.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            
            
            fIn.close();
            dis.close();
            
            
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}