import java.util.Scanner;
public class P36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		//System.out.println(s1);
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ') {
				break;
			}
			s2=ch+s2;
			s2=s2.replace(s2,"Rahul");
		}
		System.out.println(s2);
	}

}
