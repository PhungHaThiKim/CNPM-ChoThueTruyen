/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Khachhang;
import model.Nhanvien;
import model.Phieuthuetruyen;
import model.Truyen;
import model.Truyenthue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phung
 */
public class PhieuthuetruyenDAOTest {
    
    public PhieuthuetruyenDAOTest() {
    }

    /**
     * Test of addPhieuThueTruyen method, of class PhieuthuetruyenDAO.
     */
    @Test
    public void testAddPhieuThueTruyenSuccess() throws SQLException {
        System.out.println("addPhieuThueTruyen");
        Phieuthuetruyen ptt = new Phieuthuetruyen();
        
        Nhanvien nv = new Nhanvien();
        nv.setId(2);
        ptt.setNhanvien(nv);
        
        Khachhang kh = new Khachhang();
        kh.setId(2);
        ptt.setKhachhang(kh);
        
        Calendar hd = Calendar.getInstance();
        hd.set(2019, 12, 05);
        Date hiredate = hd.getTime();
        ptt.setHiredate(hiredate);
        
        Calendar pd = Calendar.getInstance();
        pd.set(2020, 01, 05);
        Date paydate = pd.getTime();
        ptt.setPaydate(paydate);
        
        float saleoff = (float) 10.0;
        ptt.setSaleoff(saleoff);
        
        int status = 0;
        ptt.setStatus(status);
        
        ArrayList<Truyenthue> listtruyenthue = new ArrayList<>();
        Truyenthue tt = new Truyenthue();
        Truyen t1 = new Truyen();
        t1.setId(1);
        t1.setPrice((float) 16.8);
        t1.setHireprice((float) 1.68);
        tt.setTruyen(t1);
        listtruyenthue.add(tt);
        ptt.setTruyenthue(listtruyenthue);
        
        PhieuthuetruyenDAO instance = new PhieuthuetruyenDAO();
        instance.getConnection().setAutoCommit(false);
        
        boolean expResult = true;
        boolean result = instance.addPhieuThueTruyen(ptt);
        assertEquals(expResult, result);

        instance.getConnection().rollback();
        instance.getConnection().setAutoCommit(true);
        
       
    }
    
    @Test
    public void testAddPhieuThueTruyenFaildWrongNV() throws SQLException {
        System.out.println("addPhieuThueTruyen");
        Phieuthuetruyen ptt = new Phieuthuetruyen();
        
        Nhanvien nv = new Nhanvien();
        nv.setId(1000);
        ptt.setNhanvien(nv);
        
        Khachhang kh = new Khachhang();
        kh.setId(2);
        ptt.setKhachhang(kh);
        
        Calendar hd = Calendar.getInstance();
        hd.set(2019, 12, 05);
        Date hiredate = hd.getTime();
        ptt.setHiredate(hiredate);
        
        Calendar pd = Calendar.getInstance();
        pd.set(2020, 01, 05);
        Date paydate = pd.getTime();
        ptt.setPaydate(paydate);
        
        float saleoff = (float) 10.0;
        ptt.setSaleoff(saleoff);
        
        int status = 0;
        ptt.setStatus(status);
        
        ArrayList<Truyenthue> listtruyenthue = new ArrayList<>();
        Truyenthue tt = new Truyenthue();
        Truyen t1 = new Truyen();
        t1.setId(1);
        t1.setPrice((float) 16.8);
        t1.setHireprice((float) 1.68);
        tt.setTruyen(t1);
        listtruyenthue.add(tt);
        ptt.setTruyenthue(listtruyenthue);
        
        PhieuthuetruyenDAO instance = new PhieuthuetruyenDAO();
        instance.getConnection().setAutoCommit(false);
        
        boolean expResult = false;
        boolean result = instance.addPhieuThueTruyen(ptt);
        assertEquals(expResult, result);

        instance.getConnection().rollback();
        instance.getConnection().setAutoCommit(true);
        
       
    }
    
    @Test
    public void testAddPhieuThueTruyenFaildWrongKH() throws SQLException {
        System.out.println("addPhieuThueTruyen");
        Phieuthuetruyen ptt = new Phieuthuetruyen();
        
        Nhanvien nv = new Nhanvien();
        nv.setId(2);
        ptt.setNhanvien(nv);
        
        Khachhang kh = new Khachhang();
        kh.setId(400);
        ptt.setKhachhang(kh);
        
        Calendar hd = Calendar.getInstance();
        hd.set(2019, 12, 05);
        Date hiredate = hd.getTime();
        ptt.setHiredate(hiredate);
        
        Calendar pd = Calendar.getInstance();
        pd.set(2020, 01, 05);
        Date paydate = pd.getTime();
        ptt.setPaydate(paydate);
        
        float saleoff = (float) 10.0;
        ptt.setSaleoff(saleoff);
        
        int status = 0;
        ptt.setStatus(status);
        
        ArrayList<Truyenthue> listtruyenthue = new ArrayList<>();
        Truyenthue tt = new Truyenthue();
        Truyen t1 = new Truyen();
        t1.setId(1);
        t1.setPrice((float) 16.8);
        t1.setHireprice((float) 1.68);
        tt.setTruyen(t1);
        listtruyenthue.add(tt);
        ptt.setTruyenthue(listtruyenthue);
        
        PhieuthuetruyenDAO instance = new PhieuthuetruyenDAO();
        instance.getConnection().setAutoCommit(false);
        
        boolean expResult = false;
        boolean result = instance.addPhieuThueTruyen(ptt);
        assertEquals(expResult, result);

        instance.getConnection().rollback();
        instance.getConnection().setAutoCommit(true);
        
       
    }
    
    @Test
    public void testAddPhieuThueTruyenFaildWrongTruyen() throws SQLException {
        System.out.println("addPhieuThueTruyen");
        Phieuthuetruyen ptt = new Phieuthuetruyen();
        
        Nhanvien nv = new Nhanvien();
        nv.setId(2);
        ptt.setNhanvien(nv);
        
        Khachhang kh = new Khachhang();
        kh.setId(2);
        ptt.setKhachhang(kh);
        
        Calendar hd = Calendar.getInstance();
        hd.set(2019, 12, 05);
        Date hiredate = hd.getTime();
        ptt.setHiredate(hiredate);
        
        Calendar pd = Calendar.getInstance();
        pd.set(2020, 01, 05);
        Date paydate = pd.getTime();
        ptt.setPaydate(paydate);
        
        float saleoff = (float) 10.0;
        ptt.setSaleoff(saleoff);
        
        int status = 0;
        ptt.setStatus(status);
        
        ArrayList<Truyenthue> listtruyenthue = new ArrayList<>();
        Truyenthue tt = new Truyenthue();
        Truyen t1 = new Truyen();
        t1.setId(1000);
        t1.setPrice((float) 17.1);
        t1.setHireprice((float) 1.71);
        tt.setTruyen(t1);
        listtruyenthue.add(tt);
        ptt.setTruyenthue(listtruyenthue);
        
        PhieuthuetruyenDAO instance = new PhieuthuetruyenDAO();
        instance.getConnection().setAutoCommit(false);
        
        boolean expResult = false;
        boolean result = instance.addPhieuThueTruyen(ptt);
        assertEquals(expResult, result);

        instance.getConnection().rollback();
        instance.getConnection().setAutoCommit(true);
        
       
    }
    
    @Test
    public void testAddPhieuThueTruyenFaildTruyenDangthue() throws SQLException {
        System.out.println("addPhieuThueTruyen");
        Phieuthuetruyen ptt = new Phieuthuetruyen();
        
        Nhanvien nv = new Nhanvien();
        nv.setId(2);
        ptt.setNhanvien(nv);
        
        Khachhang kh = new Khachhang();
        kh.setId(2);
        ptt.setKhachhang(kh);
        
        Calendar hd = Calendar.getInstance();
        hd.set(2019, 12, 05);
        Date hiredate = hd.getTime();
        ptt.setHiredate(hiredate);
        
        Calendar pd = Calendar.getInstance();
        pd.set(2020, 01, 05);
        Date paydate = pd.getTime();
        ptt.setPaydate(paydate);
        
        float saleoff = (float) 10.0;
        ptt.setSaleoff(saleoff);
        
        int status = 0;
        ptt.setStatus(status);
        
        ArrayList<Truyenthue> listtruyenthue = new ArrayList<>();
        Truyenthue tt = new Truyenthue();
        Truyen t1 = new Truyen();
        t1.setId(2);
        t1.setPrice((float) 17.1);
        t1.setHireprice((float) 1.71);
        tt.setTruyen(t1);
        listtruyenthue.add(tt);
        ptt.setTruyenthue(listtruyenthue);
        
        PhieuthuetruyenDAO instance = new PhieuthuetruyenDAO();
        instance.getConnection().setAutoCommit(false);
        
        boolean expResult = false;
        boolean result = instance.addPhieuThueTruyen(ptt);
        assertEquals(expResult, result);

        instance.getConnection().rollback();
        instance.getConnection().setAutoCommit(true);
        
       
    }
}
