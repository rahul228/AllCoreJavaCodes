import java.util.Scanner;
public class P33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0) {
				ch='A';			
			}
			System.out.print(ch);
			
		}
	}

}
