
import java.rmi.Naming;
import bean.tkbean;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class MyClient {
    public static void main(String[] args) {
    try{
    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost:1099/TinhToan");
        tkbean tk= tt.ktdn(Integer.parseInt("0123"),"123");
        if(tk!=null)
            System.out.println("Dang Nhap Thanh Cong");
        else
            System.out.println("Dang Nhap Sai");
    }catch(Exception tt) { 
        tt.printStackTrace();
    }
}
}
