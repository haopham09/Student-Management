package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAOSinhVien extends DAO{
    
    public boolean addStudent(model.SinhVien s) {
        String sql = "INSERT INTO SinhVien(MaSinhVien, HoTenSinhVien, GioiTinh, DiaChi, Email, MaLop) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaSinhVien());
            ps.setString(2, s.getHoTenSinhVien());
            ps.setString(3, s.getGioiTinh());
            ps.setString(4, s.getDiaChi());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getMaLop());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteStudent(model.SinhVien s) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM SinhVien WHERE ID = " + s.getID());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateStudent(model.SinhVien s) {
        
        String sql =
                "update SinhVien " +
                "set MaSinhVien = ?, " +
                "HoTenSinhVien = ?, " +
                "GioiTinh = ?, " +
                "DiaChi = ?, " +
                "Email = ?, " +
                "MaLop = ?" +
                "where ID = ?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaSinhVien());
            ps.setString(2, s.getHoTenSinhVien());
            ps.setString(3, s.getGioiTinh());
            ps.setString(4, s.getDiaChi());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getMaLop());
            ps.setInt(7, s.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<model.SinhVien> getListSVSearched(String sql) {
        ArrayList<model.SinhVien> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.SinhVien s = new model.SinhVien();
                s.setID(rs.getInt("ID"));
                s.setMaSinhVien(rs.getString("MaSinhVien"));
                s.setHoTenSinhVien(rs.getString("HoTenSinhVien"));
                s.setGioiTinh(rs.getString("GioiTinh"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setEmail(rs.getString("Email"));
                s.setMaLop(rs.getString("MaLop"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
