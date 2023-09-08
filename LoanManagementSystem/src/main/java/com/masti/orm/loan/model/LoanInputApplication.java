package com.masti.orm.loan.model;

import java.sql.Date;

public class LoanInputApplication {
	//customer data
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
    
   //LoanApplicantNominees
    private int lnapid1;
    private String lnapnominee;
    private String lnaprelation;
    
    //LoanApplicants
    private int lnapid2;
	private int lnapcustid;
	private Date lnapapdate;
	private int lnaplntyid;
	private double lnapamount;
	private double lnapemirangefrom;
	private double lnapemirangeto;
	private double lnapnomrequested;
	private int lnapcibilscore;
	private String lnapstatus;
	private String lnapconclusionremarks;
	private int lnapprocesseduser;
	private Date lnapprocessedDate;
	public int getCustid() {
		return custid;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public Date getCustdob() {
		return custdob;
	}
	public String getCustpanno() {
		return custpanno;
	}
	public int getCustmobile() {
		return custmobile;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public String getCustgname() {
		return custgname;
	}
	public Date getCustluudate() {
		return custluudate;
	}
	public int getCustluser() {
		return custluser;
	}
	public int getLnapid1() {
		return lnapid1;
	}
	public String getLnapnominee() {
		return lnapnominee;
	}
	public String getLnaprelation() {
		return lnaprelation;
	}
	public int getLnapid2() {
		return lnapid2;
	}
	public int getLnapcustid() {
		return lnapcustid;
	}
	public Date getLnapapdate() {
		return lnapapdate;
	}
	public int getLnaplntyid() {
		return lnaplntyid;
	}
	public double getLnapamount() {
		return lnapamount;
	}
	public double getLnapemirangefrom() {
		return lnapemirangefrom;
	}
	public double getLnapemirangeto() {
		return lnapemirangeto;
	}
	public double getLnapnomrequested() {
		return lnapnomrequested;
	}
	public int getLnapcibilscore() {
		return lnapcibilscore;
	}
	public String getLnapstatus() {
		return lnapstatus;
	}
	public String getLnapconclusionremarks() {
		return lnapconclusionremarks;
	}
	public int getLnapprocesseduser() {
		return lnapprocesseduser;
	}
	public Date getLnapprocessedDate() {
		return lnapprocessedDate;
	}
	
	
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public void setCustdob(String custdob) {
		
		this.custdob = Date.valueOf(custdob);;
	}
	public void setCustpanno(String custpanno) {
		this.custpanno = custpanno;
	}
	public void setCustmobile(int custmobile) {
		this.custmobile = custmobile;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public void setCustgname(String custgname) {
		this.custgname = custgname;
	}
	public void setCustluudate(String custluudate) {
		this.custluudate = Date.valueOf(custluudate);
	}
	public void setCustluser(int custluser) {
		this.custluser = custluser;
	}
	public void setLnapid1(int lnapid1) {
		this.lnapid1 = lnapid1;
	}
	public void setLnapnominee(String lnapnominee) {
		this.lnapnominee = lnapnominee;
	}
	public void setLnaprelation(String lnaprelation) {
		this.lnaprelation = lnaprelation;
	}
	public void setLnapid2(int lnapid2) {
		this.lnapid2 = lnapid2;
	}
	public void setLnapcustid(int lnapcustid) {
		this.lnapcustid = lnapcustid;
	}
	public void setLnapapdate(String lnapapdate) {
		this.lnapapdate = Date.valueOf(lnapapdate);
	}
	public void setLnaplntyid(int lnaplntyid) {
		this.lnaplntyid = lnaplntyid;
	}
	public void setLnapamount(double lnapamount) {
		this.lnapamount = lnapamount;
	}
	public void setLnapemirangefrom(double lnapemirangefrom) {
		this.lnapemirangefrom = lnapemirangefrom;
	}
	public void setLnapemirangeto(double lnapemirangeto) {
		this.lnapemirangeto = lnapemirangeto;
	}
	public void setLnapnomrequested(double lnapnomrequested) {
		this.lnapnomrequested = lnapnomrequested;
	}
	public void setLnapcibilscore(int lnapcibilscore) {
		this.lnapcibilscore = lnapcibilscore;
	}
	public void setLnapstatus(String lnapstatus) {
		this.lnapstatus = lnapstatus;
	}
	public void setLnapconclusionremarks(String lnapconclusionremarks) {
		this.lnapconclusionremarks = lnapconclusionremarks;
	}
	public void setLnapprocesseduser(int lnapprocesseduser) {
		this.lnapprocesseduser = lnapprocesseduser;
	}
	public void setLnapprocessedDate(String lnapprocessedDate) {
		this.lnapprocessedDate = Date.valueOf(lnapprocessedDate);;
	}
	@Override
	public String toString() {
		return "LoanInputApplication [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname="
				+ custlastname + ", custdob=" + custdob + ", custpanno=" + custpanno + ", custmobile=" + custmobile
				+ ", custaddress=" + custaddress + ", custgname=" + custgname + ", custluudate=" + custluudate
				+ ", custluser=" + custluser + ", lnapid1=" + lnapid1 + ", lnapnominee=" + lnapnominee
				+ ", lnaprelation=" + lnaprelation + ", lnapid2=" + lnapid2 + ", lnapcustid=" + lnapcustid
				+ ", lnapapdate=" + lnapapdate + ", lnaplntyid=" + lnaplntyid + ", lnapamount=" + lnapamount
				+ ", lnapemirangefrom=" + lnapemirangefrom + ", lnapemirangeto=" + lnapemirangeto
				+ ", lnapnomrequested=" + lnapnomrequested + ", lnapcibilscore=" + lnapcibilscore + ", lnapstatus="
				+ lnapstatus + ", lnapconclusionremarks=" + lnapconclusionremarks + ", lnapprocesseduser="
				+ lnapprocesseduser + ", lnapprocessedDate=" + lnapprocessedDate + "]";
	}

	
}
