package MapClasswork;

import java.util.LinkedHashMap;

public class P10 {
	int Eid;
	String ename; 
	
	P10(int Eid,String ename){
		this.Eid=Eid;
		this.ename=ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("Computer",new P10(001,"Rahul"));
		lm.put("Electronics",new P10(002,"Tsuhar"));
		lm.put("It",new P10(003,"Ashutosh"));
		lm.put("Mechanical",new P10(004,"Venky"));
		System.out.println(lm);
		
	}

	@Override
	public String toString() {
		return "P10 [Eid=" + Eid + ", ename=" + ename + "]";
	}

}
