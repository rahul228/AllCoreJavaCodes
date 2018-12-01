package MapHomework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Kulkarni");
		LinkedHashMap<Integer,String> lm=new LinkedHashMap();
		lm.putAll(hm);
		System.out.println(lm);
		lm.clear();
		System.out.println(lm);
	}

}
