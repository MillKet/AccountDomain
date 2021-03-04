package com.oops2;

public class BranchOopsPackege2 {

	private String empFirstName;
	private String empLastName;
	private double empSalary;
	private int empage;
	
	
	
	
	
	public String getEmpFirstName() {
		return empFirstName;
	}





	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}





	public String getEmpLastName() {
		return empLastName;
	}





	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}





	public double getEmpSalary() {
		return empSalary;
	}





	public void setEmpSalary(double empSalary) {
		if(empage>18) {
		this.empSalary = empSalary;}
		else {System.out.println("error");
	}




	}
	public int getEmpage() {
		return empage;
	}





	public void setEmpage(int empage) {
		this.empage = empage;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
