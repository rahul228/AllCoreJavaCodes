import java.util.Scanner;
public class P8 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=" ";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==32) {
				System.out.print(" ");
			}
			else if(ch>='A'&&ch<='Z'){
				ch+=32;
				System.out.print(ch);
			}
			else {
				ch-=32;
				System.out.print(ch);
			}
		}
	}
	

}
