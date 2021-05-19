
package model;

import java.io.Serializable;


public class Truyen implements Serializable{
    private int id;
    private String name;
    private int bookcode;
    private String type;
    private String author;
    private String publisher;
    private String publishingYear;
    private float price;
    private float hireprice;
    private String status;
    
    public Truyen()
    {
        super();
    }
    
    public Truyen(String name, int bookcode, String type, String author, String publisher, String publishingYear, float price, float hireprice, String status)
    {
        super();
        this.name = name;
        this.bookcode = bookcode;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookcode() {
        return bookcode;
    }

    public void setBookcode(int bookcode) {
        this.bookcode = bookcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
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
