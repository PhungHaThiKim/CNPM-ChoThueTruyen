
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Khachhang;

/**
 *
 * @author phung
 */
public class KhachhangDAO extends DAO{

    public KhachhangDAO() {
        super();
    }
    
    public ArrayList<Khachhang> searchClient(String key){
        ArrayList<Khachhang> result = new ArrayList<>();
        String sql = "SELECT * FROM tblkhachhang WHERE fullname LIKE ?";
        try{
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Khachhang khachhang = new Khachhang();
                khachhang.setId(rs.getInt("id"));
                khachhang.setName(rs.getString("fullname"));
                khachhang.setIdCard(rs.getString("idcard"));
                khachhang.setAddress(rs.getString("address"));
                khachhang.setPhone(rs.getString("phone"));
                khachhang.setEmail(rs.getString("email"));
                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("birthday"));  
                khachhang.setBirthday(date1);
                result.add(khachhang);
            }
        }catch(Exception e){
            e.printStackTrace();
        }	
        return result;
    }
}
