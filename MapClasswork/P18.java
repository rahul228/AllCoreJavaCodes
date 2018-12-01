package MapClasswork;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(1, "Rahul");
		tm.put(2, "Ajinkya");
		tm.put(3, "Tushar");
		Set<Entry<Integer,String>> s=tm.entrySet();
		for(Entry e:s) {
			System.out.println(e.getKey());
		}
	}

}
