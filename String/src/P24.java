import java.util.*;
public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			char ch=a.charAt(i);
			b=b+ch;
		}
		System.out.println(b);
	}

}
