package ArrayListHw;
import java.util.*;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		ArrayList <Integer> al1=(ArrayList<Integer>) al.clone();
		//al1.contains(al);
		System.out.println(al1);
		
	}

}
