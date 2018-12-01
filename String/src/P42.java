public class P42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rahul1234KUlkarni3456$@*";
		int c1=0,c2=0,c3=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
				c1++;
			}
			else if(ch>='0'&&ch<='9') {
				c2++;
			}
			else {
				c3++;
			}
		}
		System.out.println("the count of alphabets is "+c1);
		System.out.println("the count of digits is "+c2);
		System.out.println("the count of special character is "+c3);
	}

}
