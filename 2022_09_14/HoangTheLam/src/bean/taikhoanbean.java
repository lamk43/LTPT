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
public class taikhoanbean implements Serializable{
    private int MaGv;
    private String Hoten;
    private int GioiTinh;
    private String DiaChi;
    private String MatKhau;
    private int MaKhoa;

    public taikhoanbean() {
    }

    public taikhoanbean(int MaGv, String Hoten, int GioiTinh, String DiaChi, String MatKhau, int MaKhoa) {
        this.MaGv = MaGv;
        this.Hoten = Hoten;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.MatKhau = MatKhau;
        this.MaKhoa = MaKhoa;
    }

    public int getMaGv() {
        return MaGv;
    }

    public void setMaGv(int MaGv) {
        this.MaGv = MaGv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(int MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
}
