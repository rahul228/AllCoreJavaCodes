import java.util.Scanner;
public class P35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			ch+=1;
			System.out.print(ch);
		}
	}

}
