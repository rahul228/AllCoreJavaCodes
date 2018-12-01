package SetClassWork;

import java.util.HashSet;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		if(s.isEmpty()==true) {
			System.out.println("Hash set is empty");
		}
		else {
			System.out.println("HashSet contains elements");
		}
	}

}
