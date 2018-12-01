import java.util.Scanner;
public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int MAX=0;
		char ch=' ';
		for(int i=0;i<st.length();i++) {
			int count=1;
			ch=st.charAt(i);
			boolean flag=true;
			for(int j=i-1;j>=0;j--) {
				char ch1=st.charAt(j);
				if(ch==ch1) {
					flag=false;
				}
			}
			if(flag==true) {
				for(int k=i+1;k<st.length();k++) {
					char ch1=st.charAt(k);
					if(ch==ch1) {
						count++;
					}
					if(count>MAX) {
						MAX=count;
					}
					
					
				}System.out.println("count of character"+ch+"is"+count);
					
			}
			
		}System.out.println("The max count is " +MAX+" for the character "+ch);
	}

}
