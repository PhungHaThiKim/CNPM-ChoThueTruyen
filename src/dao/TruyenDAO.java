/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Truyen;

/**
 *
 * @author phung
 */
public class TruyenDAO extends DAO
{

    public TruyenDAO() {
        super();
    }
    
    public ArrayList<Truyen> searchTruyen(String key){
        ArrayList<Truyen> result = new ArrayList<>();
        String sql = "SELECT * FROM tbltruyen WHERE name LIKE ?";
        try{
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Truyen truyen = new Truyen();
                truyen.setId(rs.getInt("id"));
                truyen.setName(rs.getString("name"));
                truyen.setBookcode(rs.getInt("bookcode"));
                truyen.setType(rs.getString("type"));
                truyen.setAuthor(rs.getString("author"));
                truyen.setPublisher(rs.getString("publisher"));
                truyen.setPublishingYear(rs.getString("publishingYear"));
                truyen.setPrice(rs.getFloat("price"));
                truyen.setHireprice(rs.getFloat("hireprice"));
                truyen.setStatus(rs.getString("status"));
                result.add(truyen);
            }
        }catch(Exception e){
            e.printStackTrace();
        }	
        return result;
    }
}
