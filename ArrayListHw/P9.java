package ArrayListHw;
import java.util.*;
public class P9 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		ArrayList<Integer> al1=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al1.add(1);
		al1.add(2);
		al1.add(3);
		String s="";
		String s1="";
		for(int i=0;i<al.size();i++) {
			s="";
			s=s+al.get(i);
			for(int j=0;j<al1.size();j++) {
			s1="";
			s1=s1+al1.get(j);
			if(s.equals(s1)) {
				System.out.println("Matched");
			}
			else {
				System.out.println("Unmatched");
			}
			}
		}
	}

}
