package MapHomework;

import java.util.HashMap;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap <Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Venky");
		hm.put(3, "Ashutosh");
		hm.put(4, "Tushar");
		System.out.println("Enter the key");
		int a=sc.nextInt();
		hm.remove(a);
		System.out.println(hm);
	}

}
