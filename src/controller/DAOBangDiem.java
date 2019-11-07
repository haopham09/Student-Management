package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOBangDiem extends DAO {
    
        public boolean addBangDiem(model.BangDiem bd) {
        String sql = "INSERT INTO BangDiem(MaSinhVien, MaLop, MaMon, DiemThuongKy, DiemGiuaKy, DiemCuoiKy, DiemTongKet) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bd.getMaSinhVien());
            ps.setString(2, bd.getMaLop());
            ps.setString(3, bd.getMaMon());
            ps.setString(4, bd.getDiemThuongKy());
            ps.setString(5, bd.getDiemGiuaKy());
            ps.setString(6, bd.getDiemCuoiKy());
            ps.setString(7, bd.getDiemTongKet());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteBangDiem(model.BangDiem bd) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM BangDiem WHERE ID = " + bd.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateBangDiem(model.BangDiem bd) {
        
        String sql =
                "update BangDiem " +
                "set MaSinhVien = ?, " +
                "MaLop = ?, " +
                "MaMon = ?, " +
                "DiemThuongKy = ?, " +
                "DiemGiuaKy = ?, " +
                "DiemCuoiKy = ?, " +
                "DiemTongKet = ?" +
                "where ID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bd.getMaSinhVien());
            ps.setString(2, bd.getMaLop());
            ps.setString(3, bd.getMaMon());
            ps.setString(4, bd.getDiemThuongKy());
            ps.setString(5, bd.getDiemGiuaKy());
            ps.setString(6, bd.getDiemCuoiKy());
            ps.setString(7, bd.getDiemTongKet());
            ps.setInt(8, bd.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<model.BangDiem> getListBDSearched(String sql) {
        ArrayList<model.BangDiem> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.BangDiem bd = new model.BangDiem();
                bd.setID(rs.getInt("ID"));
                bd.setMaSinhVien(rs.getString("MaSinhVien"));
                bd.setMaLop(rs.getString("MaLop"));
                bd.setMaMon(rs.getString("MaMon"));
                bd.setDiemThuongKy(rs.getString("DiemThuongKy"));
                bd.setDiemGiuaKy(rs.getString("DiemGiuaKy"));
                bd.setDiemCuoiKy(rs.getString("DiemCuoiKy"));
                bd.setDiemTongKet(rs.getString("DiemTongKet"));
                list.add(bd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
