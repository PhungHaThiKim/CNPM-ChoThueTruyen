/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Nhanvien;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phung
 */
public class NhanvienDAOTest {
    
    public NhanvienDAOTest() {
    }

    /**
     * Test of checkLogin method, of class NhanvienDAO.
     */
    @Test
    public void testCheckLoginCorrect() {
        System.out.println("checkLogin");
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setUsernam("staffNam");
        nhanvien.setPassword("staffnam456");
        NhanvienDAO instance = new NhanvienDAO();
        boolean expResult = true;
        boolean result = instance.checkLogin(nhanvien);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckLoginWrongUsername() {
        System.out.println("checkLogin");
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setUsernam("sta");
        nhanvien.setPassword("staffnam456");
        NhanvienDAO instance = new NhanvienDAO();
        boolean expResult = false;
        boolean result = instance.checkLogin(nhanvien);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckLoginWrongPassword() {
        System.out.println("checkLogin");
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setUsernam("staffNam");
        nhanvien.setPassword("staf");
        NhanvienDAO instance = new NhanvienDAO();
        boolean expResult = false;
        boolean result = instance.checkLogin(nhanvien);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckLoginWrongUserAndPassword() {
        System.out.println("checkLogin");
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setUsernam("ggg");
        nhanvien.setPassword("staf");
        NhanvienDAO instance = new NhanvienDAO();
        boolean expResult = false;
        boolean result = instance.checkLogin(nhanvien);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckLoginEmpty() {
        System.out.println("checkLogin");
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setUsernam("");
        nhanvien.setPassword("");
        NhanvienDAO instance = new NhanvienDAO();
        boolean expResult = false;
        boolean result = instance.checkLogin(nhanvien);
        assertEquals(expResult, result);
        
    }
}
