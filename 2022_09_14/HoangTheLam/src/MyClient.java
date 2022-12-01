
import bean.taikhoanbean;
import java.rmi.Naming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quang
 */
public class MyClient {
    public static void main(String[] args) {
        try{
            IDichVu tt = (IDichVu) Naming.lookup("rmi://localhost:2001/DichVu");

            taikhoanbean tk = tt.ktdn(1, "123");
            if(tk!=null) System.out.println(tk.getHoten());
            else System.out.println("Dang nhap sai");
            
            
        } catch(Exception tt){
            tt.printStackTrace();
        }
    }
}
