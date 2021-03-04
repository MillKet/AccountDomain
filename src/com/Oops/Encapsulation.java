package com.Oops;

class Encapsulation1{
	
	private String FName;
	private String lName;
	private int age;
	private double salary;
	private double bonus;
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Encapsulation1 encap = new Encapsulation1();
 encap.setFName("miki");
 encap.setlName("mili");
 
 System.out.println(encap.getFName() + " " + encap.getlName());
 
	}

}
