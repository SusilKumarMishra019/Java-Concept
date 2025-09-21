import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc = new Scanner(System.in);
             ArrayList<String> list = new ArrayList<String>();
             
             System.out.println("Enter 5 name:");
             for(int i=0;i<=5;i++) {
            	 String name = sc.nextLine();
            	 list.add(name);
             }
             System.out.println("/nYou entered:");
             for(String name: list) {
            	 System.out.println(name);
             }
	}

}
