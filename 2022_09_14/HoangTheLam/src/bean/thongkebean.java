/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author quang
 */
public class thongkebean implements Serializable{
    private String tenKhoa;
    private int SoLuong;

    public thongkebean() {
    }

    public thongkebean(String tenKhoa, int SoLuong) {
        this.tenKhoa = tenKhoa;
        this.SoLuong = SoLuong;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
