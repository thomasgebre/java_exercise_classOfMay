package com.classofmay;

class EncapClass{
	private String fname;
	private String lname;
	private int age;
	private double salary;
	private double bonus;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EncapClass encap = new EncapClass();
		
		encap.setFname("thomas");
		encap.setLname("gebre");
		encap.setAge(37);
		encap.setSalary(4000);
		encap.setBonus(400);
		
		System.out.println(encap.getFname());
		System.out.println(encap.getLname());
		System.out.println(encap.getAge());
		System.out.println(encap.getSalary());
		System.out.println(encap.getBonus());
	}

}
