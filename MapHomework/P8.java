package MapHomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class P8 {

	int id;
	
	public P8(int id) {
		super();
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<P8,Integer> hm=new HashMap<P8,Integer>();
		hm.put(new P8(11), 22);
		hm.put(new P8(11), 23);
		hm.put(new P8(12), 24);
		hm.put(new P8(13), 25);
		hm.put(new P8(14), 26);
		hm.put(new P8(15), 27);

		Set<Entry<P8,Integer>> s=hm.entrySet();
		Iterator<Entry<P8,Integer>> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		P8 s=(P8) obj;
		if(s.id==this.id) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "id " + id ;
	}

}
