package com.Abstract;

public abstract class Bank {
      abstract int getofInterest ();
    	  
     
}

class SBI extends Bank {

	@Override
	int getofInterest() {
		// TODO Auto-generated method stub
		return 10;
	}

}

class PNB extends Bank {

	@Override
	int getofInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}

class Main {
	 public static void main(String[] args) {
		 Bank b;
		 b= new PNB();
		 System.out.println(b.getofInterest());
		 b= new SBI();
		 System.out.println(b.getofInterest());
	 }
}
