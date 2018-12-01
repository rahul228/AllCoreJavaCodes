package SetClassWork;

import java.util.ArrayList;
import java.util.HashSet;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		//al.add()
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		HashSet s=new HashSet();
		s.add(5);
		s.add(6);
		s.addAll(al);
		System.out.println(s);
	}

}
