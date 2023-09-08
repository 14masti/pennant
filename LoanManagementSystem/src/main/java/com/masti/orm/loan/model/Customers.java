package com.masti.orm.loan.model;

import java.sql.Date;

public class Customers {
	private int custid;
	private String custfirstname;
    private String custlastname;
    private Date custdob;
    private String custpanno;
    private int custmobile;
    private String custaddress;
    private String custgname;
    private Date custluudate;
    private int custluser;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public Date getCustdob() {
		return custdob;
	}
	public void setCustdob(Date custdob) {
		this.custdob = custdob;
	}
	public String getCustpanno() {
		return custpanno;
	}
	public void setCustpanno(String custpanno) {
		this.custpanno = custpanno;
	}
	public int getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(int custmobile) {
		this.custmobile = custmobile;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getCustgname() {
		return custgname;
	}
	public void setCustgname(String custgname) {
		this.custgname = custgname;
	}
	public Date getCustluudate() {
		return custluudate;
	}
	public void setCustluudate(Date custluudate) {
		this.custluudate = custluudate;
	}
	public int getCustluser() {
		return custluser;
	}
	public void setCustluser(int custluser) {
		this.custluser = custluser;
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname=" + custlastname
				+ ", custdob=" + custdob + ", custpanno=" + custpanno + ", custmobile=" + custmobile + ", custaddress="
				+ custaddress + ", custgname=" + custgname + ", custluudate=" + custluudate + ", custluser=" + custluser
				+ "]";
	}
    
    
}
