package ArrayListCw;
import java.util.*;
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.removeAll(al);
		for(int i:al) {
			System.out.println(i);
		}
		
	}

}
