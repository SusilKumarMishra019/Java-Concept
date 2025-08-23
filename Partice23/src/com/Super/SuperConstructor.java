package com.Super;

public class SuperConstructor {
        SuperConstructor() {
        	System.out.println("Super");
        }
}

class Super3 extends SuperConstructor {
	Super3() {
		super();
		System.out.println("Super3");
		
	}
}

class Super4 {
	public static void main(String[] args) {
		Super3 s3 = new Super3();
		
	}
}