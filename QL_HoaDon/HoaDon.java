/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_HoaDon;

import java.util.Date;

/**
 *
 * @author quang
 */
public class HoaDon extends ChiTietHoaDon {
    private String maHoaDon;
    private String tenKH;
    private String maNV;
    private Date ngayLapHoaDon;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String tenKH, String maNV, Date ngayLapHoaDon) {
        this.maHoaDon = maHoaDon;
        this.tenKH = tenKH;
        this.maNV = maNV;
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public HoaDon(String maHoaDon, String tenKH, String maNV, Date ngayLapHoaDon, String maSP, int soLuong, double donGia) {
        super(maSP, soLuong, donGia);
        this.maHoaDon = maHoaDon;
        this.tenKH = tenKH;
        this.maNV = maNV;
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setMaKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    @Override
    public String toString() {
        return "MaHoaDon = " + maHoaDon + "\n TenKH = " + tenKH + "\n MaNV = " + maNV + "\n NgayLapHoaDon = " + ngayLapHoaDon + "\n MaSP = " + this.getMaSP() + "\n SoLuong = " + this.getSoLuong() + "\n DonGia = " + this.getDonGia();
    }

    
}
