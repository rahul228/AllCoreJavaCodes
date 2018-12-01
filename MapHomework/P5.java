package MapHomework;

import java.util.HashMap;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Venky");
		hm.put(3, "Ashutosh");
		hm.put(4, "Tushar");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String s=sc.nextLine();
		if(hm.containsValue(s)) {
			System.out.println("Value present");
		}
		else {
			System.out.println("Value is absent");
		}
	}

}
