package Map;
import java.util.*;
import java.util.Map.Entry;
public class Restaurent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Vanilla", 25);
		hm.put("Strawberry",30);
		hm.put("ButterScotch", 40);
		hm.put("Chocolate",50);
		hm.put("Rainbow", 60);
		
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("Samosa", 100);
		hm1.put("Bhel",45);
		hm1.put("Panipuri", 10);
		hm1.put("Spdp",90);
		
		HashMap<String,Map<String,Integer>> menu=new HashMap<String,Map<String,Integer>>();
		menu.put("ICE-CREAM", hm);
		menu.put("SNACKS", hm1);
		
		System.out.println( "\t\t Welcome!!!!!");
		for(Entry<String,Map<String,Integer>> ee:menu.entrySet()) {
			String key=ee.getKey();
			System.out.println("******"+key+"******");
			Map<String, Integer> item=ee.getValue();
			for(Entry<String,Integer> subitem:item.entrySet()) {
				System.out.println(subitem.getKey()+"-->"+subitem.getValue());
			}
		}	
	
	}
	

}
