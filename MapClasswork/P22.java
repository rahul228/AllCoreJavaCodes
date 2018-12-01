package MapClasswork;

import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(3, "RAHUL");
		tm.put(4, "Tushar");
		tm.put(1, "Kulkarni");
		tm.put(2, "AShutosh");
		Set<Entry<Integer,String>> s=tm.entrySet();
		for(Entry e:s) {
			System.out.println(e.getKey()+" "+e.getValue());
			break;
		}
		Map<Integer,String> tm1=new TreeMap();
		tm1=tm.descendingMap();
		Set<Entry<Integer,String>> s1=tm1.entrySet();
		for(Entry e:s1) {
			System.out.println(e.getKey()+" "+e.getValue());
			break;
		}
		
		
	}

}
