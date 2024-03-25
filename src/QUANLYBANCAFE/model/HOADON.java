/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HOADON {
    private int MaHoaDon_ID;
    private int MaBan_ID;
    private double TongTien;
    private Date NgayBan;

    public int getMaHoaDon_ID() {
        return MaHoaDon_ID;
    }

    public void setMaHoaDon_ID(int MaHoaDon_ID) {
        this.MaHoaDon_ID = MaHoaDon_ID;
    }

    public int getMaBan_ID() {
        return MaBan_ID;
    }

    public void setMaBan_ID(int MaBan_ID) {
        this.MaBan_ID = MaBan_ID;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }
    
}
