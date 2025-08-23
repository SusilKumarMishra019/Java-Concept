package com.Super;

public class Supermethod {
	void run() {
		System.out.println("Super is running");
	}
}

class Super2 extends Supermethod {
	void run() {
		System.out.println("Super1 is rinning");
	}
	void eat() {
		System.out.println("Super1 is eating");
	}
	void Show() {
		super.run();
		eat();
	}
}

class Ram1 {
	public static void main(String[] args) {
		Super2 s2 = new Super2();
		s2.Show();
	}
}