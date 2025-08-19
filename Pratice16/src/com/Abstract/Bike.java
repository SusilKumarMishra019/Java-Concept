package com.Abstract;

public abstract class Bike {
         Bike () {
        	 System.out.println("Bike is running");
         }
       abstract void run();
       void gearchange() {
    	   System.out.println("gearchange");
       }
}

class Honda extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda is Safty");
	}
	
}

