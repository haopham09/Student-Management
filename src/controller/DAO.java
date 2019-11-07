package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    
    public Connection conn;
    
    protected DAO() {
        try {
            conn =  DriverManager.getConnection("jdbc:ucanaccess://E:\\QLSV.accdb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
