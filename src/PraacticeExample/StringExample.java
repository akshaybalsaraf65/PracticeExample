package PraacticeExample;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abc");
		String s2 = new String("xyz");
		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("xyz");
		sb1 = sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb2);
		
		String s3 = "abc";
		String s4 = s3.concat("xyz");
		System.out.println(s4);
		
		String s5 = "abc";
		String s6 = "abc";
		System.out.println(s5 == s6);
		String s7 = new String("abc");
		String s8 = new String("abc");
		System.out.println(s7 == s8);
		System.out.println(s5 == s7);
		System.out.println(s6 == s8);
		System.out.println(s5.compareTo(s6));
		String s9 = new String("ABC");
		System.out.println(s5.compareTo(s9));
		System.out.println(s5.compareToIgnoreCase(s9));
		System.out.println(s5.compareTo(s6));
		System.out.println(s7.compareTo(s8));
		String s10 = new String("abc");
		String s11 = s10.intern();
		System.out.println(s11);
	}

}
