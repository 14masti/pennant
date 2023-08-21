/*********************employeee.java**************************/

package com.reshu;

public class employee {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	public employee(int empno, String ename, String job, double sal) {
		// TODO Auto-generated constructor stub
		this.ename=ename;
		this.empno=empno;
		this.job=job;
		this.sal=sal;
	}
	public int getEmpid() {
		return empno;
	}
	public void setEmpid(int empid) {
		this.empno = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
