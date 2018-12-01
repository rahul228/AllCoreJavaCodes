import java.util.Scanner;
public class P31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER the string");
		String s=sc.nextLine();
		s=s.substring(0,s.length()-1);
		System.out.println(s);
	}

}
