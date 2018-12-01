package MapHomework;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Kulkarni");
		hm.put(3, "Raghu");
		hm.put(4, "Raj");
		hm.put(5, "Rajan");
		System.out.println("Enter below which key you want to display");
		int a=sc.nextInt();
		Set<Entry<Integer,String>> s=hm.entrySet();
		for(Entry e:s) {
		
				
			}
		}
	}

}
