package ArrayListCw;
import java.util.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al=new ArrayList();
		al.add("Red");
		al.add("violet");
		al.add("Black");
		al.add("Indigo");
		al.add("White");
		Iterator itr=al.iterator();
		for(int i=0;i<al.size();i++) {
			System.out.println(itr.next());
		}
		
	}

}
