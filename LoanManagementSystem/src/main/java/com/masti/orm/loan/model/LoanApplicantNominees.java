package com.masti.orm.loan.model;

public class LoanApplicantNominees {
	
	private int lnapid;
    private String lnapnominee;
    private String lnaprelation;
	public LoanApplicantNominees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLnapid() {
		return lnapid;
	}
	public void setLnapid(int lnapid) {
		this.lnapid = lnapid;
	}
	public String getLnapnominee() {
		return lnapnominee;
	}
	public void setLnapnominee(String lnapnominee) {
		this.lnapnominee = lnapnominee;
	}
	public String getLnaprelation() {
		return lnaprelation;
	}
	public void setLnaprelation(String lnaprelation) {
		this.lnaprelation = lnaprelation;
	}
	
    

}
