/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.service;

import QUANLYBANCAFE.model.BAN;
import QUANLYBANCAFE.DAO.BANDAO;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BANservice {
    private BANDAO bandao;
    
    public BANservice(){
        bandao = new BANDAO();
    }
    
    public  ArrayList<BAN> getAllBAN(){
        return bandao.getAllBAN();
    }
    
    public void addBan(BAN ban){
        bandao.addBAN(ban);
    }
    
    public void deleteBan(int ID){
        bandao.deleteBAN(ID);
    }
    
    public void updateBan(BAN ban){
        bandao.updateBAN(ban);
    }
    
    public BAN getBanbyID(int MaBan_ID){
        return bandao.getBanbyID(MaBan_ID);
    }
}
