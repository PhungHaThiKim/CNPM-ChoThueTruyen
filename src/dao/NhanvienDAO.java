/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Nhanvien;

/**
 *
 * @author phung
 */
public class NhanvienDAO extends DAO {

    public NhanvienDAO() {
        super();
    }
    
    public boolean checkLogin(Nhanvien nhanvien) {
        System.out.println("Checklogin...");
        boolean result = false;
        
        String sql = "SELECT id, fullname, position FROM tblnhanvien WHERE username = ? AND password = ?";
        try {
                PreparedStatement ps = getConnection().prepareStatement(sql);
                ps.setString(1, nhanvien.getUsername());
                ps.setString(2, nhanvien.getPassword());
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    nhanvien.setId(rs.getInt("id"));
                    nhanvien.setName(rs.getString("fullname"));
                    nhanvien.setPosition(rs.getString("position"));
                    result = true;
                }
        }catch(Exception e) {
                e.printStackTrace();
        }
        return result;
    }
}
