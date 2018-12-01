import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String s="";
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			s=s+ch;
			if(ch==' ') {
				System.out.println("The first word in the string is "+s);
				break;
			}
			
		}
	}

}
