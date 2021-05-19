/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Phieuthuetruyen;
import model.Truyen;
import model.Truyenthue;

/**
 *
 * @author phung
 */
public class PhieuthuetruyenDAO extends DAO{

    public PhieuthuetruyenDAO() {
        super();
    }
    
    public boolean addPhieuThueTruyen(Phieuthuetruyen ptt)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sqlAddphieuthue = "INSERT INTO tblphieuthuetruyen(idkhachhang, idnhanvien, hiredate, paydate, saleoff, status) VALUES(?,?,?,?,?,?)";
        String sqlAddtruyenthue = "INSERT INTO tbltruyenthue(idphieuthuetruyen, idtruyen, saleoff, price, hireprice, status) VALUES(?,?,?,?,?,?)";
        String sqlChecktruyenthue = "SELECT * FROM tbltruyen WHERE id = ? AND status = 'Đang thuê'"; // truong hop ghi de
        String sqlUpdatetruyen = "UPDATE tbltruyen SET status='Đang thuê' WHERE id=?"; // update status
        boolean result = true;
        
        try {
            getConnection().setAutoCommit(false);
            
            PreparedStatement ps = getConnection().prepareStatement(sqlAddphieuthue, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ptt.getKhachhang().getId());
            ps.setInt(2, ptt.getNhanvien().getId());
            ps.setString(3, sdf.format(ptt.getHiredate()));
            ps.setString(4, sdf.format(ptt.getPaydate()));
            ps.setFloat(5, ptt.getSaleoff());
            ps.setInt(6, ptt.getStatus());
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next())
            {
                ptt.setId(generatedKeys.getInt(1));
                
                for (Truyenthue tt : ptt.getTruyenthue())
                {
                    Truyen truyen = tt.getTruyen();
                    ps = getConnection().prepareStatement(sqlChecktruyenthue);
                    ps.setInt(1, truyen.getId());
                    
                    ResultSet rs = ps.executeQuery();
                    if (rs.next())
                    {
                        result = false;
                        try {
                            getConnection().rollback();
                            getConnection().setAutoCommit(true);    //comment in juint mode
                        }catch(Exception ex) {
                            result = false;
                            ex.printStackTrace();
                        }
                        return result;
                    }
                    
                    ps = getConnection().prepareStatement(sqlAddtruyenthue, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, ptt.getId());
                    ps.setInt(2, truyen.getId());
                    ps.setFloat(3, ptt.getSaleoff());
                    ps.setFloat(4, truyen.getPrice());
                    ps.setFloat(5, truyen.getHireprice());
                    ps.setString(6, "Đang");
                    
                    ps.executeUpdate();			
                    generatedKeys = ps.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        tt.setId(generatedKeys.getInt(1));
                    }
                    
                    ps = getConnection().prepareStatement(sqlUpdatetruyen);
                    ps.setInt(1, truyen.getId());
                    ps.executeUpdate();
                }
            }
            
        } catch (SQLException e) {
            result = false;
            try {				
                getConnection().rollback();
            }catch(Exception ex) {
                result = false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        finally {
            try {				
                getConnection().setAutoCommit(true);        // comment in JUnit test mode
            }catch(Exception ex) {
                result = false;
                ex.printStackTrace();
            }
        }
        return result;
    }
}
