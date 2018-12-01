package ArrayListCw;
import java.util.*;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList();
		ArrayList <Integer> al3=new ArrayList();
		ArrayList<String> al2=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al2.add("Rahul");
		al2.add("Vishwas");
		al2.add("Kulkarni");
		al3.add(1);
		al3.add(2);
		al3.add(3);
		System.out.println(al3.containsAll(al));
		
	}

}
