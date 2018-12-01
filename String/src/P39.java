import java.util.Scanner;
public class P39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is rahul kulkarni";
		String s1="";
		int i;
		for(i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				break;
			}
		}
		for(int j=i+1;j<s.length();j++) {
			char ch=s.charAt(j);
			s1=s1+ch;
		}
		System.out.println(s1);
	}

}
