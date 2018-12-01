package MapClasswork;

import java.util.HashMap;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Ajinkya");
		hm.put(3, "Chetan");
		hm.put(4, "Tushar");
		hm.put(5, "Ankit");
		System.out.println(hm);
		
		HashMap hm1=new HashMap();
		hm1.put("Rahul",1);
		hm1.put("Ajinkya",2);
		hm1.put("Chetan",3);
		hm1.put("Tushar",4);
		hm1.put("Ankit",5);
		System.out.println(hm1);
	}

}
