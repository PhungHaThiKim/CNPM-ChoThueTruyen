package model;

import java.io.Serializable;
import java.util.Date;

public class Khachhang implements Serializable{
	
        private int id;
	private String name;
	private String idCard;
        private Date birthday;  
	private String address;
	private String email;
	private String phone;
	
	public Khachhang() {
		super();
	}
	
	public Khachhang(String name, String idCard, Date birthday, String address, String email, String phone) {
		super();
		this.name = name;
		this.idCard = idCard;
                this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.phone = phone;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String rs = "";
        rs += "Khach Hang |"
                + " Name: " + getName()
                + " Phone: " + getPhone()
                + " Id Card: "+getIdCard();
        return rs;
    }
    
    
}
