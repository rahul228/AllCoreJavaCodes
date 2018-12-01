package SetClassWork;

import java.util.HashSet;
import java.util.TreeSet;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		TreeSet t=new TreeSet();
		t.addAll(s);
		System.out.println(t);
	}

}
