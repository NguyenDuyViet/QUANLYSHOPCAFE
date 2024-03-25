/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.service;

import QUANLYBANCAFE.model.KHUVUC;
import QUANLYBANCAFE.DAO.KhuVucDao;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhuVucService {
    private KhuVucDao khuvucdao;
    
    public KhuVucService(){
        khuvucdao = new KhuVucDao();
    }
    
    public ArrayList<KHUVUC> getAllKhuVuc() {
        return khuvucdao.getAllKhuVuc();
    }
    
    public ArrayList<String> getAllMaKV() {
        ArrayList<String> maKVList = new ArrayList<>();
        ArrayList<KHUVUC> khuVucList = khuvucdao.getAllKhuVuc();
        for (KHUVUC kv : khuVucList) {
            maKVList.add(String.valueOf(kv.getMaKhuVuc_ID()));
        }
        return maKVList;
    }
}
