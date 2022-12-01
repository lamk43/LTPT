/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.KetNoi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bean.tkbean;
/**
 *
 * @author hoang
 */
public class dangnhapdao {
    public tkbean ktdn(int sotaikhoan, String matkhau){
        try {
            //b1: ket noi vao csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            //b2: lay du lieu ve
            String sql="select * from GiaoVien where SoTaiKhoan=? and MatKhau=?";
            PreparedStatement cmd=(PreparedStatement) kn.cn.prepareStatement(sql);
            cmd.setInt(1, sotaikhoan);
            cmd.setString(2, matkhau);
            ResultSet rs=cmd.executeQuery();
            tkbean tk=null;
            if(rs.next()==false)
                return null;
            else{
                String HoTen= rs.getString("HoTen");
                String GioiTinh= rs.getString("GioiTinh");
                String DiaChi= rs.getString("DiaChi");
                String MaKhoa= rs.getString("MaKhoa");
                int SoTaiKhoan=rs.getInt("SoTaiKhoan");
                String MatKhau=rs.getString("Matkhau");
                tk= new tkbean(SoTaiKhoan, HoTen, GioiTinh, DiaChi, MatKhau, MaKhoa, MaKhoa);
            }
            rs.close();kn.cn.close();
            return tk;
        } catch (Exception e) {
            e.printStackTrace();return null;
        }
    }
    
    
}
