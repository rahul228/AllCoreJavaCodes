import java.util.Scanner;
public class P26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i!=s.length()-1) {
				continue;
			}
			else {
				System.out.println("The last occurance of the character is "+i+ " And the character is "+ch);
			}
		}
	}

}
