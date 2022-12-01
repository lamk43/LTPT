/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author hoang
 */
public class tkbean {
    private int MaGiaoVien;
    private String HoTen;
    private String GioiTinh;
    private String DiaChi;
    private String MatKhau;
    private String Makhoa;
    private String SoTaiKhoan;

    public tkbean() {
    }

    public tkbean(int MaGiaoVien, String HoTen, String GioiTinh, String DiaChi, String MatKhau, String Makhoa, String SoTaiKhoan) {
        this.MaGiaoVien = MaGiaoVien;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.MatKhau = MatKhau;
        this.Makhoa = Makhoa;
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public int getMaGiaoVien() {
        return MaGiaoVien;
    }

    public void setMaGiaoVien(int MaGiaoVien) {
        this.MaGiaoVien = MaGiaoVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
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

    public String getMakhoa() {
        return Makhoa;
    }

    public void setMakhoa(String Makhoa) {
        this.Makhoa = Makhoa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    
}