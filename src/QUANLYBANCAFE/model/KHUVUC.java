/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLYBANCAFE.model;

/**
 *
 * @author AD
 */
public class KHUVUC {
    private  int MaKhuVuc_ID;
    private  String TenKhuVuc;
    private  String MoTa;

    public int getMaKhuVuc_ID() {
        return MaKhuVuc_ID;
    }

    public void setMaKhuVuc_ID(int MaKhuVuc_ID) {
        this.MaKhuVuc_ID = MaKhuVuc_ID;
    }

    public String getTenKhuVuc() {
        return TenKhuVuc;
    }

    public void setTenKhuVuc(String TenKhuVuc) {
        this.TenKhuVuc = TenKhuVuc;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    public String toString()
    {
       return this.TenKhuVuc;
    }
}
