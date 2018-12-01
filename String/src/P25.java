import java.util.Scanner;
public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Rahul Kulkarni";
		s=" "+s;
		String s1="";
		String s3="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==32) {
				System.out.print(s3+" ");
				s3="";
			}else
				s3=ch+s3;
		}
		/*System.out.print(s3+" ");*/
		
	}

}
