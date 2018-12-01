package MapHomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Venky");
		hm.put(3, "Ashutosh");
		hm.put(4, "Tushar");
		
		Set<Entry<Integer,String>> s=hm.entrySet();
		Iterator<Entry<Integer,String>> i=s.iterator();		
		while(i.hasNext()) {
			Entry<Integer,String> e=i.next();
			i.remove();
		}System.out.println(hm);
		
	}

}
