package com.String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//1-using+(String	+ concatenation)
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
          String str=sc.nextLine();
          String rev="";
          int len=str.length();
          for(int i =len-1;i>=0;i--) {
        	  rev=rev+str.charAt(i);
          }
          System.out.println("Reverse String "+rev);
        
		
		//2-Using Character array
		
		String str ="ABCDE";
		String rev="";
	char  a[] = str.toCharArray();
	int len =a.length;
	for(int i=len-1;i>=0;i--) {
		rev=rev+a[i];
	}
	System.out.println("Reverse name : " +rev);
	*/	
		String str ="ABCD";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
