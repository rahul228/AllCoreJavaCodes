package August3;

public class Count {
	static int i=0;
	
	void Count(){
		i=i+1;
		System.out.println(i);
	}
	public static void main(String ar[]) {
		Count b=new Count();
		b.Count();
		Count b1=new Count();
		b1.Count();
		Count b2=new Count();
		b2.Count();
	}

}

