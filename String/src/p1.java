public class p1 {
	public static void main(String[] args) {
	String st="ThinkQuotient Think";
	String st2="Think";
	String st1=new String ("Think");
	if(st==st2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	st=st.replace("Think", "Th");
	System.out.println(st);
}
}
