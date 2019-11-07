package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOLopHoc extends DAO {
    
    public boolean addLopHoc(model.LopHoc lh) {
        String sql = "INSERT INTO LopHoc(MaLop, TenLop, GiaoVienChuNhiem, MaKhoa) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lh.getMaLop());
            ps.setString(2, lh.getTenLop());
            ps.setString(3, lh.getGiaoVienChuNhiem());
            ps.setString(4, lh.getMaKhoa());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean deleteLopHoc(model.LopHoc lh) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM LopHoc WHERE ID = " + lh.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean updateLopHoc(model.LopHoc lh) {
        
        String sql =
                "update LopHoc " +
                "set MaLop = ?, " +
                "TenLop = ?, " +
                "GiaoVienChuNhiem = ?, " +
                "MaKhoa = ?" +
                "where ID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lh.getMaLop());
            ps.setString(2, lh.getTenLop());
            ps.setString(3, lh.getGiaoVienChuNhiem());
            ps.setString(4, lh.getMaKhoa());
            ps.setInt(5, lh.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<model.LopHoc> getListLHSearched(String sql) {
        ArrayList<model.LopHoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.LopHoc lh = new model.LopHoc();
                lh.setID(rs.getInt("ID"));
                lh.setMaLop(rs.getString("MaLop"));
                lh.setTenLop(rs.getString("TenLop"));
                lh.setGiaoVienChuNhiem(rs.getString("GiaoVienChuNhiem"));
                lh.setMaKhoa(rs.getString("MaKhoa"));
                list.add(lh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
