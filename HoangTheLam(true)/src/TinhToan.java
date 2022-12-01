
import bean.tkbean;
import dao.dangnhapdao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author hoang
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    
    public TinhToan() throws RemoteException{
    }
    

    @Override
    public int Cong(int a, int b) throws Exception {
      int s=a+b;
      System.out.print("Tong: " + s);
      return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
       int s=a-b;
      System.out.print("Tru: " + s);
      return s;
    }
    
    @Override
    public int Nhan(int a, int b) throws Exception {
       int s=a*b;
      System.out.print("Nhan: " + s);
      return s;
    }
    
    @Override
    public double Chia(int a, int b) throws Exception {
       double s=a/b;
      System.out.print("Chia: " + (double)s);
      return s;
    }
    dangnhapdao dn= new dangnhapdao();
    @Override
    public tkbean ktdn(int sotaikhoan, String matkhau) throws Exception {
       return dn.ktdn(sotaikhoan, matkhau);
    }
    
}
