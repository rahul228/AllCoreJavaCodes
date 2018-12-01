package MapClasswork;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class P5 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Ajinkya");
		hm.put(3, "Chetan");
		hm.put(4, "Tushar");
		hm.put(5, "Ankit");
		Set<Entry<Integer,String>> s=hm.entrySet();
		for(Map.Entry m:s) {
			System.out.println(m.getKey()+" "+m.getValue()+" ");
		}
	}

}
