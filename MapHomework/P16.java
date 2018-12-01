package MapHomework;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class P16 {
	String name;

	public P16(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, P16> lm=new LinkedHashMap();
		lm.put(1,new P16("Rahul"));
		lm.put(2,new P16("Kulkarni"));
		lm.put(3,new P16("Ashutosh"));
		lm.put(4,new P16("Nilpawar"));
		int max=0,max1;
		Set<Entry<Integer,P16>> s=lm.entrySet();
		for(Entry m:s) {
			max1=(int)m.getKey();
			if(max<max1) {
				max=max1;
			}
		}
		//System.out.println(max);
		for(Entry m:s) {
			int m1=(int)m.getKey();
			if(m1==max) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
		}
	}

	@Override
	public String toString() {
		return  name;
	}

}
