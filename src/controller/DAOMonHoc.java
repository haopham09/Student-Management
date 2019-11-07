package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOMonHoc extends DAO {
    
    public boolean addMonHoc(model.MonHoc k) {
        String sql = "INSERT INTO MonHoc(MaMon, TenMonHoc, SoTinChi) "
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaMon());
            ps.setString(2, k.getTenMonHoc());
            ps.setString(3, k.getSoTinChi());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean deleteMonHoc(model.MonHoc k) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM MonHoc WHERE ID = " + k.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateMonHoc(model.MonHoc k) {
        
        String sql =
                "update MonHoc " +
                "set MaMon = ?, " +
                "TenMonHoc = ?, " +
                "SoTinChi = ?" +
                "where ID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaMon());
            ps.setString(2, k.getTenMonHoc());
            ps.setString(3, k.getSoTinChi());
            ps.setInt(4, k.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<model.MonHoc> getListMHSearched(String sql) {
        ArrayList<model.MonHoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.MonHoc k = new model.MonHoc();
                k.setID(rs.getInt("ID"));
                k.setMaMon(rs.getString("MaMon"));
                k.setTenMonHoc(rs.getString("TenMonHoc"));
                k.setSoTinChi(rs.getString("SoTinChi"));
                list.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
//    public ArrayList<model.MonHoc> getListMonHoc() {
//        ArrayList<model.MonHoc> list = new ArrayList<>();
//        String sql = "SELECT * FROM MonHoc";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()) {
//                model.MonHoc k = new model.MonHoc();
//                k.setID(rs.getInt("ID"));
//                k.setMaMon(rs.getString("MaMon"));
//                k.setTenMonHoc(rs.getString("TenMonHoc"));
//                k.setSoTinChi(rs.getString("SoTinChi"));
//                list.add(k);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
    
}
