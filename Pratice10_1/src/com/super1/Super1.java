package com.super1;

public class Super1 {
         int id;
         String name;
         Super1(int id, String name) {
        	 this.id=id;
        	 this.name= name;
         }
         
}

class Super2 extends Super1 {
	float Salary;
	Super2(int id,String name,float Salary) {
		super(id,name);
		this.Salary=Salary;
	}
	void display () {
		System.out.println(id+ "" +name+" "+ Salary);
	}
}

class Super3 {
	public static void main(String[] args) {
		Super2 e1 = new Super2(1,"Susil",7.00f);
		e1.display();
	}
}
