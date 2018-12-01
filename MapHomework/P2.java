package MapHomework;

import java.util.HashMap;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1, "Rahul");
		if(hm.isEmpty()) {
			System.out.println("Hash map is empty");
		}
		else {
			System.out.println("Has elements");
		}
	}

}
