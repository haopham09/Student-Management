package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOKhoa extends DAO {
      
/*
    Không cần k.getID() vì ID trong Khoa đã được tự động thêm (autoNumber)
*/
    public boolean addKhoa(model.Khoa k) {
        String sql = "INSERT INTO Khoa(MaKhoa, TenKhoa) "
                + "VALUES(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaKhoa());
            ps.setString(2, k.getTenKhoa());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
/*
    Sử dụng k.getID() vì ID trong Khoa cũng là giá trị duy nhất
*/
    public boolean deleteKhoa(model.Khoa k) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Khoa WHERE ID = " + k.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
/*
    Sử dụng k.getID() vì ID trong Khoa cũng là giá trị duy nhất
*/   
    public boolean updateKhoa(model.Khoa k) {
        
        String sql =
                "update Khoa " +
                "set MaKhoa = ?, " +
                "TenKhoa = ?" +
                "where ID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaKhoa());
            ps.setString(2, k.getTenKhoa());
            ps.setInt(3, k.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<model.Khoa> getListKSearched(String sql) {
        ArrayList<model.Khoa> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.Khoa k = new model.Khoa();
                k.setID(rs.getInt("ID"));
                k.setMaKhoa(rs.getString("MaKhoa"));
                k.setTenKhoa(rs.getString("TenKhoa"));
                list.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
/*
    Hàm này lấy giá trị ID lớn nhất trong Khoa(CSDL) nhằm hỗ trợ việc thêm mới dữ liệu trong hàm themKhoa() (ở view/Khoa.java)
*/    
    public int getMax() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        String sql = "SELECT * FROM Khoa";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                list.add(rs.getInt("ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
           
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > list.get(i-1))
                max = list.get(i);
        }
        return max;
    }
    
}
