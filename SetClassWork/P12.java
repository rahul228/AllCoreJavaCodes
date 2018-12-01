package SetClassWork;

import java.util.TreeSet;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet();
		ts.add("yellow");
		ts.add("Violet");
		ts.add("Grey");
		ts.add("Black");
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}

}
