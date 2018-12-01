public class P41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234rahul5678";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
				continue;
			}
			else {
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}

}
