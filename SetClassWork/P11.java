package SetClassWork;

import java.util.Iterator;
import java.util.TreeSet;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet();
		ts.add("yellow");
		ts.add("Violet");
		ts.add("Grey");
		ts.add("Black");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
