package MapClasswork;

import java.util.LinkedHashMap;

public class P13 {
	int id;
	String nm;
	
	P13(int id,String nm){
		this.id=id;
		this.nm=nm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(1, new P13(001,"Rahul"));
		lm.put(2, new P13(002,"Ajinkya"));
		lm.put(3, new P13(003,"Shubham"));
		//System.out.println();
		lm.remove(002);
		System.out.println(lm);
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nm=" + nm + "]";
	}

}
