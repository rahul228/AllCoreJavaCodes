package ArrayListCw;
import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		Iterator itr=al.iterator();
		for(int i:al) {
			System.out.println(itr.next());
			
		}
	}

}
