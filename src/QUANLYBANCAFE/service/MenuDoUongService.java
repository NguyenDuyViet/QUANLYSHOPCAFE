/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.service;

import QUANLYBANCAFE.DAO.MenuDoUongDao;
import QUANLYBANCAFE.model.MENUDOUONG;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class MenuDoUongService {
    private MenuDoUongDao menudouongDao;
    
    public MenuDoUongService(){
        menudouongDao = new MenuDoUongDao();
    }
    
    public ArrayList<MENUDOUONG> getAllMenuDoUong(){
        return menudouongDao.getAllMenuDoUong();
    }
    
    public void addMenu(MENUDOUONG menu){
        menudouongDao.addMenuDoUong(menu);
    }
    
    public void deleteMenu(int ID){
        menudouongDao.deleteMenuDoUong(ID);
    }
    
    public void updateMenu(MENUDOUONG menu){
        menudouongDao.updateMenuDoUong(menu);
    }
}
