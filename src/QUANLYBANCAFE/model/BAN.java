/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.model;

/**
 *
 * @author ADMIN
 */
public class BAN {
    private int MaBan_ID;
    private String TenBan;
    private boolean TrangThai;
    private String MoTa;
    private int MaKhuVuc_ID;

    public int getMaBan_ID() {
        return MaBan_ID;
    }

    public void setMaBan_ID(int MaBan_ID) {
        this.MaBan_ID = MaBan_ID;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getMaKhuVuc_ID() {
        return MaKhuVuc_ID;
    }

    public void setMaKhuVuc_ID(int MaKhuVuc_ID) {
        this.MaKhuVuc_ID = MaKhuVuc_ID;
    }
}
