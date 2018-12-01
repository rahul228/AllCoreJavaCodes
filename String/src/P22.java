import java.util.Scanner;
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the STring");
		String st=sc.nextLine();
		String s="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&& ch<='Z') {
				ch+=32;
				s=s+ch;
			}
			else if(ch>='a'&&ch<='z') {
				ch-=32;
				s=s+ch;
			}
			else {
				s=s+ch;
			}
		}
		System.out.println(s);
	}

}
