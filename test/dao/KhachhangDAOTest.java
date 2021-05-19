/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Khachhang;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phung
 */
public class KhachhangDAOTest {
    
    public KhachhangDAOTest() {
    }

    /**
     * Test of searchClient method, of class KhachhangDAO.
     */
    @Test
    public void testSearchClientNotFound() {
        System.out.println("searchClient");
        String key = "xxxxxxxxxxxx";
        KhachhangDAO instance = new KhachhangDAO();
        ArrayList<Khachhang> expResult = new ArrayList<>();
        ArrayList<Khachhang> result = instance.searchClient(key);
        
        assertNotNull(result);
        assertEquals(0, result.size());

    }
    
    @Test
    public void testSearchClientOneResult() {
        System.out.println("searchClient");
        String key = "Cao Thị Trang";
        KhachhangDAO instance = new KhachhangDAO();
        ArrayList<Khachhang> expResult = new ArrayList<>();
        ArrayList<Khachhang> result = instance.searchClient(key);
        
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0).getName().contains(key)); // dảm bảo kq thứ 0 phải có tên chứa key
    }
    
    @Test
    public void testSearchClientMoreThanOneResult() {
        System.out.println("searchClient");
        String key = "Tr";
        KhachhangDAO instance = new KhachhangDAO();
        ArrayList<Khachhang> expResult = new ArrayList<>();
        ArrayList<Khachhang> result = instance.searchClient(key);
        
        assertNotNull(result);
        assertEquals(2, result.size()); // có 2 row trong db
        for (int i=0; i<2; i++)
            assertTrue(result.get(i).getName().contains(key));
    }
}
