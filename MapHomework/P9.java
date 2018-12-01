package MapHomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class P9 {
int id;
String name;
	public P9(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<P9,P9> hm=new HashMap();
		hm.put(new P9(1, "Rahul"),new P9(1,"Kulkarni"));
		hm.put(new P9(1, "Rahul"),new P9(1,"Kulkarni"));
		hm.put(new P9(2, "Ashutosh"),new P9(2,"Kulkarni"));
		hm.put(new P9(3, "Rahul"),new P9(3,"Kulkarni"));
		Set<Entry<P9,P9>> s=hm.entrySet();
		Iterator<Entry<P9,P9>> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		P9 s=(P9) obj;
		if(s.id==this.id&&s.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "id " + id + ", name " + name ;
	}


}
