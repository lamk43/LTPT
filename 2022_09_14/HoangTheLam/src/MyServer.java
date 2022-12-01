

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;
import java.rmi.registry.*;

/**
 *
 * @author quang
 */
public class MyServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(2001);
            DichVu dv = new DichVu();
            Naming.bind("rmi://localhost:2001/DichVu", dv);
            System.out.print("Da cho may khach goi den:");
        }catch(Exception tt) {
            tt.printStackTrace();
        }
    }
}
