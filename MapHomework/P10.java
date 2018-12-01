package MapHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		ArrayList al1=new ArrayList();
		al1.add("Rahul");
		al1.add("Ashu");
		al1.add("Venky");
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap();
		hm.put(1,al);
		hm.put(2, al1);
		Set<Entry<Integer, ArrayList<Integer>>> s=hm.entrySet();
		Iterator<Entry<Integer,ArrayList<Integer>>> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public String toString() {
		return "P10 []";
	}

}
