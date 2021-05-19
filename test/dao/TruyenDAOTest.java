/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Truyen;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phung
 */
public class TruyenDAOTest {
    
    public TruyenDAOTest() {
    }

    /**
     * Test of searchTruyen method, of class TruyenDAO.
     */
    @Test
    public void testSearchTruyenNotFound() {
        System.out.println("searchTruyen");
        String key = "uiyiretert";
        TruyenDAO instance = new TruyenDAO();
        ArrayList<Truyen> expResult = new ArrayList<>();
        ArrayList<Truyen> result = instance.searchTruyen(key);
        assertNotNull(result);
        assertEquals(0, result.size());

    }
    
    // Tìm truyện chỉ trả lại 1 kết quả 
    @Test
    public void testSearchTruyenOneResult() {
        System.out.println("searchTruyen");
        String key = "Doremon (Tập 10)";
        TruyenDAO instance = new TruyenDAO();
        ArrayList<Truyen> expResult = new ArrayList<>();
        ArrayList<Truyen> result = instance.searchTruyen(key);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0).getName().contains(key));
    }
    
    // Tìm truyện nhiều hơn 1 kết quả
    @Test
    public void testSearchTruyenMoreThanOneResult() {
        System.out.println("searchTruyen");
        String key = "Doremon";
        TruyenDAO instance = new TruyenDAO();
        ArrayList<Truyen> expResult = new ArrayList<>();
        ArrayList<Truyen> result = instance.searchTruyen(key);
        assertNotNull(result);
        assertEquals(4, result.size());
        for (int i=0; i<4; i++)
            assertTrue(result.get(i).getName().contains(key));
    }
}
