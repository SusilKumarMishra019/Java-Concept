package com.methodoverloading;

public class Overloading {
         public static int add(int a, int b) {
        	 return a+ b;
         }
         
         public static double add(double a, double b) {
        	 return a+b;
         }
}

class Adder {
	public static void main(String[] args) {
		System.out.println(Overloading.add(11, 220));
		System.out.println(Overloading.add(22.999,66.87876));
		
	}
}
