package ArrayListCw;
import java.util.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList();
		ArrayList <Integer> al2=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al2.add(1);
		al2.add(2);
		al2.add(4);
		al2.retainAll(al);
		for(int i:al2) {
			System.out.println(i);
		}
	}

}
