package MapClasswork;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P14_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeMap tm=new TreeMap();
			tm.put(1,"Rahul");
			tm.put(2,"Kulkarni");
			tm.put(3, "Ajinkya");
			Set<Entry<Integer,String>> s=tm.entrySet();
			for(Entry m:s) {
				System.out.println(m.getKey());
				
			}
			for(Entry m:s) {
				System.out.println(m.getValue());
				
			}
			
			
	}

}
