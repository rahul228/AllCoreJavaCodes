package MapHomework;

import java.util.HashMap;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap();
		hm.put(1, "Rahul");
		hm.put(2, "Ashutosh");
		hm.put(3, "Kunal");
		hm.put(4, "Vaibhav");
		HashMap<Integer, String> hm1=new HashMap();
		hm1=hm;
		System.out.println("Original hash map is:-"+hm);
		System.out.println("Copied HashMap is:-"+hm1);
	}

}
