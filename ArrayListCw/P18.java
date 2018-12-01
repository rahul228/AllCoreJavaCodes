package ArrayListCw;
import java.util.*;
public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> al=new ArrayList();
		for(int i=0;i<5;i++) {
			al.add(i);
		}
		//Iterator i1=al.iterator();
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
