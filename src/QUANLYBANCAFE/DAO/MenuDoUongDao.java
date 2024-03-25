/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.DAO;

import QUANLYBANCAFE.model.MENUDOUONG;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class MenuDoUongDao {
    public ArrayList<MENUDOUONG> getAllMenuDoUong(){
        ArrayList<MENUDOUONG> MENUS = new ArrayList<MENUDOUONG>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM MENUDOUONG";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                MENUDOUONG menu = new MENUDOUONG();
                
                menu.setMaDoUong_ID(rs.getInt("MaDoUong_ID"));
                menu.setTenDoUong(rs.getString("TenDoUong"));
                menu.setDonGia_ID(rs.getString("DonGia_ID"));
                menu.setMaDanhMuc_ID(rs.getInt("MaDanhMuc_ID"));
                
                MENUS.add(menu);
            }
            rs.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return MENUS;
    }
    
    public void addMenuDoUong(MENUDOUONG menu){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO MENUDOUONG(MaDoUong_ID, TenDoUong, DonGia, MaDanhMuc_ID)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, menu.getMaDoUong_ID());
            preparedStatement.setString(2, menu.getTenDoUong());
            preparedStatement.setString(3, menu.getDonGia_ID());
            preparedStatement.setInt(4, menu.getMaDanhMuc_ID());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateMenuDoUong(MENUDOUONG menu){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "UPDATE MENUDOUONG SET TenDoUong=?, DonGia=?, MaDanhMuc_ID=? WHERE MaDoUong_ID=?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, menu.getTenDoUong());
            preparedStatement.setString(2, menu.getDonGia_ID());
            preparedStatement.setInt(3, menu.getMaDanhMuc_ID());
            preparedStatement.setInt(4, menu.getMaDoUong_ID());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
    
    public void deleteMenuDoUong(int ID){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql ="DELETE FROM MENUDOUONG WHERE MaDoUong_ID=?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
