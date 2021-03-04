package com.Oops;

import com.oops2.OopsPackege;

public class Enck2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OopsPackege emp = new OopsPackege();
		
		emp.setEmpFirstName("Miki");
		emp.setEmpLastName("Mili");
		emp.setEmpSalary(30000);
		emp.setEmpage(25);
		
		System.out.println("Employ First Name:" + emp.getEmpFirstName());
		System.out.println("Employ Last Name:" + emp.getEmpLastName());
		System.out.println("Employ age:" + emp.getEmpage());
		System.out.println("Employ Salary:" + emp.getEmpSalary());
	}

}
