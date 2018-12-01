import java.util.Scanner;
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		int count =0,count1=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			else {
				if(ch==' ') {
					continue;
				}
				else {
				count1++;
				}
			}
		}
		System.out.println("THe total number of vowels are"+count);
		System.out.println("THe total number of consonants are"+count1);
	}

}
