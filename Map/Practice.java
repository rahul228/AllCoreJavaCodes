package Map;
import java.util.*;
import java.util.Map.Entry;
public class Practice {
	public static void main(String[] args) {
	HashMap <Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1, "Rahul");
	hm.put(2, "Tushar");
	hm.put(3, "Mithilesh");
	hm.put(4, "Chetan");
	hm.put(5, "Ajinkya");
	hm.put(6, "Venkatesh");
	System.out.println(hm);
	HashMap <Integer,String> hm1=new HashMap<Integer,String>();
	hm1.put(7, "Kulkarni");
	hm1.put(8, "Tagadpallewar");
	hm1.put(9, "Mithilesh");
	hm1.put(10, "Chetan");
	hm1.put(11, "Ajinkya");
	hm1.put(12, "Venkatesh");
	//System.out.println(hm);
	hm.putAll(hm1);
	System.out.println(hm);
	//System.out.println(hm1.put(1, "Rahul"));
	System.out.println(hm1.get(7));
	hm1.remove(8);
	System.out.println(hm1);
	System.out.println(hm.containsKey(7));
	System.out.println(hm.size());
	hm.clear();
	System.out.println(hm);
	System.out.println(hm.isEmpty());
	Set<Integer> s=hm1.keySet();
	for(Integer i:s) 
		System.out.println("keys"+s);
	
	Collection <String>c=hm1.values();
	System.out.println("values"+c);
	
	/*Set<Entry<Integer,String>> itr=Set.iterator();
	
	while(itr.hasNext()) {
		Map.Entry<Integer, String>ee=itr.next();
		System.out.println(ee.getKey()+" "+ee.getValue()+" ");
	}*/
	Set<Entry<Integer,String>> ss=hm1.entrySet();
	for(Entry<Integer, String> me:ss) {
		System.out.println(me.getKey()+"\t"+me.getValue());
	}
	
	}
}
