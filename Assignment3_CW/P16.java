package Assignment3_CW;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,2,3,4,1,5,0,0};
		int c;
		for(int i=0;i<a.length;i++) {
			c=1;
			boolean flag=true;
			for(int j=i-1;j>=0;j--) {
				
				if(a[i]==a[j]) {
					c++;
					flag=false;
				}
			}
			if(flag==true) {
				
				for(int k=i+1;k<a.length;k++) {
				if(a[i]==a[k]) {
					c++;	
					}
				}System.out.println("The freaquency of"+a[i]+":-"+c);
			}	
		}
	}
}
