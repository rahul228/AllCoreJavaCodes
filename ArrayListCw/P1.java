package ArrayListCw;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want in your array");
		int a=sc.nextInt();
		System.out.println("Enter the elements(numbers) of the array");
		for(int i=0;i<a;i++) {
			System.out.println("Enter the element");
			al.add(sc.nextInt());
		}
		System.out.println("The elements of the array are");
		Iterator k=al.iterator();
		for(int i=0;i<a;i++) {
			System.out.println(k.next());
		}
		
		System.out.println("Enter the elements of the string array");
		for(int i=0;i<a;i++) {
			al1.add(sc.next());
		}
		System.out.println("The elements of the String array are");
		Iterator k1=al1.iterator();
		for(int i=0;i<a;i++) {
			System.out.println(k1.next());
		}
	}

}
