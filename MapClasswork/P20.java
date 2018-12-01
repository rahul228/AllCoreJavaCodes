package MapClasswork;

import java.util.TreeMap;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm=new TreeMap();
		tm.put(1, "Rahul");
		tm.put(2, "Ajinkya");
		tm.put(3, "Tushar");
		System.out.println("Cloning tree map");
		 
		   //System.out.println("Original map: "+ tm);
		 
		   System.out.println("Cloned map: "+ tm.clone());
	}

}
