public class P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Rahul kulkarni";
		String s1="";
		String s2="";
		int count=0,c = 0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				count++;	
			}
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			s1=s1+ch;
			if(c!=count&&ch==' ') {
				s2=s1;
				c++;	
			}
		}System.out.print(s2);
		
	}

}
