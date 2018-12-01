package ArrayListCw;

import java.util.ArrayList;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.remove(2);
		for(int i:al) {
			System.out.println(i);
		}
	}

}
