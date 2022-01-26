package PraacticeExample;

public class NumberExample {

//	public void display(Integer i) {
//		
//		System.out.println("hello integer call" + i);
//	}
//	
//	public void display(int ii) {
//	
//		System.out.println("hello int call" + ii);
//	}
	
	void display(Object o) {
		
		System.out.println("call object " + o);
	}
	
	void display(String s) {
		
		System.out.println("call string " + s);
	}
	
	public static void main(String[] args) {
		
		NumberExample n = new NumberExample();
		n.display("shhshs");
		
		
		Object ob = "ddddddd";
	}
	
}
