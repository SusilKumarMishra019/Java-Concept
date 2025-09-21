
package com.Done;

interface Multiple {
	
	void sound();
         
}

 class Dogs implements Multiple {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cool");
	}
	
}
 
 class Fan implements Multiple {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		 System.out.println("Fool");
	}
	 
 }
 
 class Honda {
	 public static void main(String[] args) {
		Multiple p = new Dogs();
		Multiple g = new Fan();
		p.sound();
		g.sound();
	}
 }
