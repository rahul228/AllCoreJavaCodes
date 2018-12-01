package ArrayListCw;
import java.util.*;
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		
		Collections.swap(al,0,2);
		for(int i:al) {
			System.out.print(i+" ");
		}
	}

}
