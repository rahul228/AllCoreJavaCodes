package SetClassWork;

import java.util.HashSet;
import java.util.Iterator;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
