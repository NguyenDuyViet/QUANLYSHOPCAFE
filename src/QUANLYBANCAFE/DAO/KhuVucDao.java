/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUANLYBANCAFE.DAO;

import QUANLYBANCAFE.model.KHUVUC;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhuVucDao {
    public ArrayList<KHUVUC> getAllKhuVuc(){
        ArrayList<KHUVUC> khuvucs = new ArrayList<KHUVUC>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM KHUVUC";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                KHUVUC khuvuc = new KHUVUC();
                khuvuc.setMaKhuVuc_ID(rs.getInt("MaKhuVuc_ID"));
                khuvuc.setTenKhuVuc(rs.getString("TenKhuVuc"));
                khuvuc.setMoTa(rs.getString("MoTa"));
                khuvucs.add(khuvuc);
            }
            
            rs.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khuvucs;   
    }
    
    public void addKhuVuc(KHUVUC khuvuc){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO KHUVUC(MaKhuVuc_ID, TenKhuVuc, MoTa) VALUES(?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, khuvuc.getMaKhuVuc_ID());
            preparedStatement.setString(2, khuvuc.getTenKhuVuc());
            preparedStatement.setString(3, khuvuc.getMoTa());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateKhuVuc(KHUVUC khuvuc) {
    Connection connection = JDBCConnection.getJDBCConnection();
    String sql = "UPDATE KHUVUC SET TenKhuVuc=?, MoTa=? WHERE MaKhuVuc_ID=?";
    
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, khuvuc.getTenKhuVuc());
        preparedStatement.setString(2, khuvuc.getMoTa());
        preparedStatement.setInt(3, khuvuc.getMaKhuVuc_ID());
        
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void deleteKhuVuc(int MaKhuVuc_ID){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "DELETE FROM KHUVUC WHERE MaKhuVuc_ID=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, MaKhuVuc_ID);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
