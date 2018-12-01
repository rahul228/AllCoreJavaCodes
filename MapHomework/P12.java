package MapHomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Kulkarni");
		HashMap<Integer,String> hm1=new HashMap();
		hm1.putAll(hm);
		//System.out.println(hm1);
		Set<Entry<Integer,String>> s=hm1.entrySet();
		Iterator<Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
