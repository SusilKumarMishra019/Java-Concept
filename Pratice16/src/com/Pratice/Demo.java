package com.Pratice;

public  class Demo {
        static int X =100;
          int Y = 200;
          
          void display() {
        	  Integer d = X;
        	  System.out.println("Variabele:"+X +" "+Y);
        	  System.out.println("Address-like value of y: " +
        	            Integer.toHexString(System.identityHashCode(d)));

          }



          static class Main {
          
          public static void main(String[] args) {
        	  Demo d = new Demo();
        	 
        	  System.out.println("Variable Adderes :" + Integer.toHexString(System.identityHashCode(obj)));
          }
}
}