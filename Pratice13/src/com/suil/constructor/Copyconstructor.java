package com.suil.constructor;

public class Copyconstructor {
	
	int id;
	String name;
	
	Copyconstructor(int i,String n) {
		id =i;
		name =n;
	}
	Copyconstructor(Copyconstructor c) {
		id=c.id;
		name=c.name;
	}
	void display() {
		System.out.println(id +" " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Copyconstructor c1=new Copyconstructor(111,"Susil");
                 Copyconstructor c2 = new Copyconstructor(c1);
                 
                 c1.display();
                 c2.display();
	}

}
