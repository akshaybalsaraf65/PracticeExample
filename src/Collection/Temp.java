package Collection;

public class Temp {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "temp";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("finalize method called");
		super.finalize();
	}
}
