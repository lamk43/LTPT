/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.thongkebean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class thongkedao {
    public ArrayList<thongkebean> thongke () {
        try {
            ArrayList<thongkebean> ds = new ArrayList<thongkebean>();
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            
            // new Views trong sql
            String sql = "select * from vtam1";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            thongkebean tk = null;
            
            while(rs.next()) {
                String tenkhoa = rs.getString("tenkhoa");
                int SoLuong = rs.getInt("abc");

                ds.add(new thongkebean(tenkhoa, SoLuong));
            }
            
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
