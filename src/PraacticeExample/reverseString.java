package PraacticeExample;

public class reverseString {

	static {

		System.out.println("call method");
		System.exit(0);
	}

	
//	  public static void main(String[] args) {
//	  
//	  
//	  System.out.println("main call"); }
	
	public static void main(String[] args) {
	
		String str = "abcd";
		System.out.println(str);
		for(int i =str.length()-1;i>0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
	}
	
	 
}
