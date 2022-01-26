package PraacticeExample;

@FunctionalInterface
public interface interfaceb {

	public void showaa();
	
default void showab() {
		
		
		System.out.println("call default");
	}

static void showabab() {
	
	System.out.println("call static");
}
}
