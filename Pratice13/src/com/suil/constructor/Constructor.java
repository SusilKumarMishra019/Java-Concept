package com.suil.constructor;

public class Constructor {
          int id;
           String name;
          int age;
          
          Constructor(int i,String n) {
        	  id=i;
        	  name=n;
          }
          
          Constructor(int i ,String n,int a) {
        	  id=i;
        	  name=n;
        	  age=a;
          }
          
          void display() {
        	  System.out.println(id+ " "+ name+ " " +age);
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Constructor c1 = new Constructor(111,"Susil",23);
          Constructor c2 = new Constructor(222,"Sunil",35);
          c1.display();
          c2.display();
	}

}
