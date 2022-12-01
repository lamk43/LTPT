/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bean.taikhoanbean;
import bean.thongkebean;
import dao.dangnhapdao;
import dao.thongkedao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author quang
 */
public class DichVu extends UnicastRemoteObject implements IDichVu{

    public DichVu() throws RemoteException {
    }
    
    
    dangnhapdao dn = new dangnhapdao();
    @Override
    public taikhoanbean ktdn(int maGV, String matKhau) throws Exception {
        return dn.ktdn(maGV, matKhau);
    }
    
    thongkedao tk = new thongkedao();
    @Override
    public ArrayList<thongkebean> thongke () throws Exception {
        return tk.thongke();
    }
    
}