
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Phieuthuetruyen implements Serializable{
   private int id;
   private Khachhang khachhang;
   private Nhanvien nhanvien;
   private Date hiredate;
   private Date paydate;
   private float saleoff;
   private int status;
   private ArrayList<Truyenthue> truyenthue;
   public Phieuthuetruyen()
   {
       super();
       truyenthue = new ArrayList<Truyenthue>();
   }
   public Phieuthuetruyen( Khachhang khachhang, Nhanvien nhanvien, Date hiredate, Date paydate, float saleoff, int status, ArrayList<Truyenthue> truyenthue)
   {
       super();
       this.khachhang = khachhang;
       this.nhanvien = nhanvien;
       this.hiredate = hiredate;
       this.paydate = paydate;
       this.saleoff = saleoff;
       this.status = status;
       this.truyenthue = truyenthue;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public Nhanvien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public float getSaleoff() {
        return saleoff;
    }

    public void setSaleoff(float saleoff) {
        this.saleoff = saleoff;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Truyenthue> getTruyenthue() {
        return truyenthue;
    }

    public void setTruyenthue(ArrayList<Truyenthue> truyenthue) {
        this.truyenthue = truyenthue;
    }
   
}
