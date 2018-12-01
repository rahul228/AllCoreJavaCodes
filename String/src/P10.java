public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="HELLO$WORLD";
		String st1="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='$') {
				st1=st1+ch;
				System.out.print(st1);
			}
			else {
				System.out.print(ch);
			}
		}
	}

}
