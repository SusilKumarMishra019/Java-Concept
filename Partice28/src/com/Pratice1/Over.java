package com.Pratice1;

public class Over {
            static int add(int a, int b) {
            	return a + b;
            }
            
            static int add(int a, int b, int c) {
            	return a + b + c;
            }
}

class Man {
	public static void main(String[] args) {
		System.out.println(Over.add(22,55));
		System.out.println(Over.add(33,44,55));
	}
}
