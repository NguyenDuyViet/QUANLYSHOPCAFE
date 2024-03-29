package QUANLYBANCAFE.DAO;

import QUANLYBANCAFE.model.BAN;
import QUANLYBANCAFE.DAO.JDBCConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class BANDAO {
    public ArrayList<BAN> getAllBAN(){
        ArrayList<BAN> bans = new ArrayList<BAN>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM BAN";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                BAN ban = new BAN();
                ban.setMaBan_ID(rs.getInt("MaBan_ID"));
                ban.setTenBan(rs.getString("TenBan"));
                ban.setTrangThai(rs.getBoolean("TrangThai"));
                ban.setMoTa(rs.getString("MoTa"));
                ban.setMaKhuVuc_ID(rs.getInt("MaKhuVuc_ID"));
                bans.add(ban);
            }
            
            // Đóng ResultSet và PreparedStatement
            rs.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return bans;
    }
    
    public void addBAN(BAN ban){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO BAN(MaBan_ID, TenBan, TrangThai, MoTa, MaKhuVuc_ID) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ban.getMaBan_ID());
            preparedStatement.setString(2, ban.getTenBan());
            preparedStatement.setBoolean(3, ban.isTrangThai());
            preparedStatement.setString(4, ban.getMoTa());
            preparedStatement.setInt(5, ban.getMaKhuVuc_ID());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateBAN(BAN ban){
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE BAN SET TenBan=?, TrangThai=?, MoTa=?, MaKhuVuc_ID=? WHERE MaBan_ID=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ban.getTenBan());
            preparedStatement.setBoolean(2, ban.isTrangThai());
            preparedStatement.setString(3, ban.getMoTa());
            preparedStatement.setInt(4, ban.getMaKhuVuc_ID());
            preparedStatement.setInt(5, ban.getMaBan_ID());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public BAN getBanbyID(int MaBan_ID){
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM BAN WHERE MaBan_ID=?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, MaBan_ID);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                BAN ban = new BAN();
                
                ban.setMaBan_ID(rs.getInt("MaBan_ID"));
                ban.setTenBan(rs.getString("TenBan"));
                ban.setTrangThai(rs.getBoolean("TrangThai"));
                ban.setMoTa(rs.getString("MoTa"));
                ban.setMaKhuVuc_ID(rs.getInt("MaKhuVuc_ID"));
                return ban;
            }
            
            // Đóng ResultSet và PreparedStatement
            rs.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void deleteBAN(int MaBan_ID){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "DELETE FROM BAN WHERE MaBan_ID=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, MaBan_ID);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
