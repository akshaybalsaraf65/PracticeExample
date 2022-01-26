package PraacticeExample;

public interface Example1 {

	public void add();
	public int sub();
	default void show() {
		
		System.out.println("secound interface");
	}
	
	static void display() {
		
		System.out.println("secound interface");
	}
}
