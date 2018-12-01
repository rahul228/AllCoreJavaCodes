package MapHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap <Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Venky");
		hm.put(3, "Ashutosh");
		hm.put(4, "Tushar");
		System.out.println(hm.size());
		System.out.println("Enter the key");
		int a=sc.nextInt();
		if(a<=hm.size()) {
			System.out.println("The value associated with key is"+hm.get(a));
		}
		else {
			System.out.println("The hashmap dose not contain the specified key");
		}
	}

}
