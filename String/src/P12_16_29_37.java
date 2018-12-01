import java.util.Scanner;
public class P12_16_29_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		a=a.trim();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			int c=1;
			boolean flag=true;
			for(int j=i-1;j>=0;j--) {
				char ch1=a.charAt(j);
				if(ch==ch1) {
				flag=false;
				}
			}
		
		if(flag==true) {
			for(int k=i+1;k<a.length();k++) {
				char ch1=a.charAt(k);
				if(ch==ch1) {
					c++;
					}
			}System.out.println("frequency of "+ch+" is "+c);
				
			}
		}
}
}
