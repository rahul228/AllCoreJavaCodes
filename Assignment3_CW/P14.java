package Assignment3_CW;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,3,4,5,3,4,5};
		int c=0,i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<i;j++) {
				if(a[i]==a[j]) 
					break;
			}
				
			if(i==j) 
				System.out.print(a[i]+" ");
			
		}
	}

}
