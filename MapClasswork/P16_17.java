package MapClasswork;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class P16_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(1, "Rahul");
		tm.put(2, "Ajinkya");
		tm.put(3, "Tushar");
		System.out.println("Enter the key you want to search");
		int a=sc.nextInt();
		if(a>3) {
			System.out.println("Enter key less than 3");
		}
		else {
			Set<Entry<Integer,String>> s=tm.entrySet();
			for(Entry m:s) {
				int b=(int) m.getKey();
				if(b==a) {
					System.out.println("Found key:"+m.getKey());
				}
			}
		}
	}

}
