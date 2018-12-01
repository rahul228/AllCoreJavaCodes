package ArrayListCw;
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("Rahul");
		Iterator itr=al.iterator();
		for(int i=0;i<al.size();i++) {
			System.out.println(itr.next());
		}
	}

}
