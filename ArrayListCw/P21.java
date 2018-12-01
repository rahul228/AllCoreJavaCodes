package ArrayListCw;
import java.util.*;
public class P21 {
	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		Integer a[]=new Integer[al.size()];
		al.toArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
