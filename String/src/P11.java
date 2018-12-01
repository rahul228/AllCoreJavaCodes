import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="1123 ThinkQuotientQ";
		int i;
		boolean flag=false;
		System.out.println("The given string is");
		System.out.println(st);
		System.out.println("Enter the character you want to search");
		char ch1=sc.next().charAt(0);
		for(i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch==ch1) {
			if((ch>='A'&&ch<='Z')||(ch>='a'&& ch<='z')) {
				flag=true;
				break;
			}
			}
		}
		if(flag==true) {
		System.out.println(i);	
		}
	}
}
