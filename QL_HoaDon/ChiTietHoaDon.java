/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_HoaDon;

/**
 *
 * @author quang
 */
public class ChiTietHoaDon {
    private String maSP;
    private int soLuong;
    private double donGia;
    double GiamGia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double ThanhTien(double mucGiamGia) {
        GiamGia = (this.getSoLuong() * this.getDonGia()) - ((mucGiamGia / 100) * (this.getSoLuong() * this.getDonGia()));
        return GiamGia;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "maSP=" + maSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + ThanhTien(GiamGia) + '}';
    }
    
    
}
