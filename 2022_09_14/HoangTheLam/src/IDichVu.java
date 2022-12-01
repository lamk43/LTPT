

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import bean.taikhoanbean;
import bean.thongkebean;
import java.rmi.*;
import java.util.ArrayList;
/**
 *
 * @author quang
 */
public interface IDichVu extends Remote{
    public taikhoanbean ktdn (int maGV, String matKhau) throws Exception;
    public ArrayList<thongkebean> thongke () throws Exception;
}
