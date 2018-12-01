package MapClasswork;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(3, "RAHUL");
		tm.put(4, "Tushar");
		tm.put(1, "Kulkarni");
		tm.put(2, "AShutosh");
		Set<Entry<Integer,String>> s=tm.entrySet();
		for(Entry e:s) {
			System.out.println("The lower key is:-"+e.getKey());
			break;
		}
		Map<Integer,String> tm1=new TreeMap();
		tm1=tm.descendingMap();
		Set<Entry<Integer,String>> s1=tm1.entrySet();
		for(Entry e:s1) {
			System.out.println("The higher key is:-"+e.getKey());
			break;
		}
	}

}
