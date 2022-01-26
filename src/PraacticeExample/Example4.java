package PraacticeExample;

public class Example4 implements interfacea,interfaceb{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example4 ee = new Example4();
		ee.showab();
		interfacea.showabab();
		
	}

	@Override
	public void showaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showab() {
		// TODO Auto-generated method stub
		interfacea.super.showab();
	}

	@Override
	public Double dsss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void method(String s) {
		// TODO Auto-generated method stub
		
	}

	

}
