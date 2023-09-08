package com.masti.orm.loan.model;

import java.sql.Date;

public class LoanApplicants {
	
	private int lnapid;
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
	
	
	public LoanApplicants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLnapid() {
		return lnapid;
	}
	public void setLnapid(int lnapid) {
		this.lnapid = lnapid;
	}
	public int getLnapcustid() {
		return lnapcustid;
	}
	public void setLnapcustid(int lnapcustid) {
		this.lnapcustid = lnapcustid;
	}
	public Date getLnapapdate() {
		return lnapapdate;
	}
	public void setLnapapdate(Date lnapapdate) {
		this.lnapapdate = lnapapdate;
	}
	public int getLnaplntyid() {
		return lnaplntyid;
	}
	public void setLnaplntyid(int lnaplntyid) {
		this.lnaplntyid = lnaplntyid;
	}
	public double getLnapamount() {
		return lnapamount;
	}
	public void setLnapamount(double lnapamount) {
		this.lnapamount = lnapamount;
	}
	public double getLnapemirangefrom() {
		return lnapemirangefrom;
	}
	public void setLnapemirangefrom(double lnapemirangefrom) {
		this.lnapemirangefrom = lnapemirangefrom;
	}
	public double getLnapemirangeto() {
		return lnapemirangeto;
	}
	public void setLnapemirangeto(double lnapemirangeto) {
		this.lnapemirangeto = lnapemirangeto;
	}
	public double getLnapnomrequested() {
		return lnapnomrequested;
	}
	public void setLnapnomrequested(double lnapnomrequested) {
		this.lnapnomrequested = lnapnomrequested;
	}
	public int getLnapcibilscore() {
		return lnapcibilscore;
	}
	public void setLnapcibilscore(int lnapcibilscore) {
		this.lnapcibilscore = lnapcibilscore;
	}
	public String getLnapstatus() {
		return lnapstatus;
	}
	public void setLnapstatus(String lnapstatus) {
		this.lnapstatus = lnapstatus;
	}
	public String getLnapconclusionremarks() {
		return lnapconclusionremarks;
	}
	public void setLnapconclusionremarks(String lnapconclusionremarks) {
		this.lnapconclusionremarks = lnapconclusionremarks;
	}
	public int getLnapprocesseduser() {
		return lnapprocesseduser;
	}
	public void setLnapprocesseduser(int lnapprocesseduser) {
		this.lnapprocesseduser = lnapprocesseduser;
	}
	public Date getLnapprocessedDate() {
		return lnapprocessedDate;
	}
	public void setLnapprocessedDate(Date lnapprocessedDate) {
		this.lnapprocessedDate = lnapprocessedDate;
	}
	
	
	
}
