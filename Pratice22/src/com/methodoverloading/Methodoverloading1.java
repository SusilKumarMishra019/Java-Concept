package com.methodoverloading;

public class Methodoverloading1 {
	/*
	 * methodoverloading in java is a feature that enables defining a class having
	 * same method name but diferent parameter. it is a two type; 1- changing the
	 * data type 2-changing the argument
	 */
	//create a method
	
	
       static int add(int a, int b) {
    	   return a + b;
       }
       static double add(double a, double b ,double c) {
    	   return a+b+c;
       }
}

class Adder1 {
	public static void main(String[] args) {
		System.out.println(Methodoverloading1.add(11,22));
		System.out.println(Methodoverloading1.add(11.888,33.67,44));
		
	}
}
