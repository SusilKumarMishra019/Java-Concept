package com.Super;

public class Instancevariable {
	int age =23;
   
   

}

class Super1 extends Instancevariable {
	int age= 40;
	
	void show() {
		System.out.println(age);
		System.out.println(super.age);
	}
}

class Ram {
	public static void main(String[] args) {
	Super1 s1 =new Super1();
		System.out.println(s1.age);
		s1.age=30;
		System.out.println(s1.age);
	}
}