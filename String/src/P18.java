import java.util.Scanner;
public class P18 {
//To remove all occurance of chara ter from a given string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter the character");
		char ch1=sc.next().charAt(0);
		char ch=0;
		int c=0;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch==ch1) {
				c=i;
				break;
				
			}
		}
		for(int j=0;j<s.length();j++) {
			ch=s.charAt(j);
			if(j==c) {
				ch++;
				System.out.print(ch);
			}
			else {
				System.out.print(ch);
			}
		}
	}

}
