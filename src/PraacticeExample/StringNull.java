package PraacticeExample;

public class StringNull {

	void display(Object o) {
		
		System.out.println("call object " + o);
	}
	
	void display(String s) {
		
		System.out.println("call string " + s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringNull sn = new StringNull();
		//sn.display(null);
		
		new StringNull().display(1254);
		
		parent p = new child();
		p.test();
		
		int a[] = {10,20,3,};
		System.out.println(a.length);
		
		boolean bool = true;
		
		if(bool = false) {
			System.out.println("a");
		}else if(bool){
			System.out.println("b");
		}else if(!bool) {
			System.out.println("c");
		}else {
			System.out.println("d");
		}
		
		StringNull sn = new StringNull();
		sn.method();
	}

	public static void method() {
		System.out.println("NullPointerException");
	}
}


class parent{
	
	void test() {
		System.out.println("parent");
	}
}

class child extends parent{
	 
	void test() {
		
		System.out.println("child");
	}
}