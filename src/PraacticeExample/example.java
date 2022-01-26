package PraacticeExample;

public interface example {

	public void add();
	public int sub();
	default void show() {
		
		System.out.println("first interface");
	}
	
	static void display() {
		
		System.out.println("first interface");
	}
}
