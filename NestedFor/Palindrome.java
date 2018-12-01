package NestedFor;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;int sum=0,b,temp=0;
		
		for(i=1;i<=1000;i++) {
			sum=0;
			temp=i;
			while(temp>0) {
				b=temp%10;
				sum=sum*10+b;
				temp=temp/10;
				if(sum==i) {
					System.out.println(i);	
			}
			
			}
			
		}
	}

} 
