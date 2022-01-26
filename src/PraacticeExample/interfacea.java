package PraacticeExample;

//@FunctionalInterface
public interface interfacea {

	public void showaa();
	
	public Double dsss();
	public void method(String s);
	default void showab() {
		
		
		System.out.println("call default");
	}
	
	static void showabab() {
		
		System.out.println("call static");
	}
}
