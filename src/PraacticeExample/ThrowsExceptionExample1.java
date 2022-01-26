package PraacticeExample;

public class ThrowsExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExceptionExample tw = new ThrowsExceptionExample();
		
		try {
			tw.f1();
			System.out.println("tt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("call catch block");
			e.printStackTrace();
		}
	}

}
