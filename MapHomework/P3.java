package MapHomework;

import java.util.HashMap;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2,"Ajinkya");
		hm.put(3, "Venky");
		hm.put(4, "Ashutosh");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key you want to search");
		int a=sc.nextInt();
		if(hm.containsKey(a)) {
			System.out.println("The key is present");
		}
		else {
			System.out.println("The key is absent");
		}
	}

}
