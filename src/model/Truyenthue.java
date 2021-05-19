
package model;

import java.io.Serializable;


public class Truyenthue implements Serializable{
    private int id;
    private Phieuthuetruyen phieu;
    private Truyen truyen;
    private float saleoff;
    private float price;
    private float hireprice;
    private String status;
    
    public Truyenthue()
    {
        super();
    }
    public Truyenthue( Phieuthuetruyen phieu, Truyen truyen, float saleoff, float price, float hireprice, String status)
    {
        super();
        this.phieu = phieu;
        this.truyen = truyen;
        this.saleoff = saleoff;
        this.price = price;
        this.hireprice = hireprice;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Phieuthuetruyen getPhieu() {
        return phieu;
    }

    public void setPhieu(Phieuthuetruyen phieu) {
        this.phieu = phieu;
    }

    public Truyen getTruyen() {
        return truyen;
    }

    public void setTruyen(Truyen truyen) {
        this.truyen = truyen;
    }

    public float getSaleoff() {
        return saleoff;
    }

    public void setSaleoff(float saleoff) {
        this.saleoff = saleoff;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getHireprice() {
        return hireprice;
    }

    public void setHireprice(float hireprice) {
        this.hireprice = hireprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
