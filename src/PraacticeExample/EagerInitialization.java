package PraacticeExample;

public class EagerInitialization {

	private static EagerInitialization obj = new EagerInitialization();
	public String string;
	
	public EagerInitialization() {
		
		string = "akakka";
	}
	
	public static EagerInitialization getInstance()
	  {
	    return obj;
	  }
	
	public static void main(String[] args) {
		
		EagerInitialization text = EagerInitialization.getInstance();
		System.out.println("Original String:");
	    System.out.println(text.string);
	    //text in upper case
	    System.out.println("String in Upper Case:");
	    text.string = (text.string).toUpperCase();
	    System.out.println(text.string);
	    
	    EagerInitialization text1 = new EagerInitialization();
	}
	
}
