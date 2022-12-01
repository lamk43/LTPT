/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author quang
 */
public class dangnhapdao {
    
    public taikhoanbean ktdn (int maGV, String matKhau) {
        try {
            // b1: Ket noi csdl
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from GiaoVien where MaGv=? and MatKhau=?";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setInt(1, maGV);
            cmd.setString(2, matKhau);
            ResultSet rs = cmd.executeQuery();
            taikhoanbean tk = null;
            
            if(rs.next()) {
                int MaGv = rs.getInt("MaGv");
                String Hoten = rs.getString("Hoten");
                int GioiTinh = rs.getInt("GioiTinh");
                String DiaChi = rs.getString("DiaChi");
                String MatKhau = rs.getString("MatKhau");
                int MaKhoa = rs.getInt("MaKhoa");

                tk = new taikhoanbean(MaGv, Hoten, GioiTinh, DiaChi, MatKhau, MaKhoa);
            }
            
            rs.close();
            kn.cn.close();
            return tk;
            
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
//    public static void main(String[] args) {
//        taikhoanbean tk = new taikhoanbean();
//        dangnhapdao dndao = new dangnhapdao();
//        tk = dndao.ktdn(1, "123");
//        System.out.println(tk.getHoten());
//    }
        
        
        
}
