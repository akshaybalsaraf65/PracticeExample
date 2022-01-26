package PraacticeExample;

public class ClassImmutabletest {

	private static ClassImmutabletest classimmutabletest = null;
	
	private ClassImmutabletest() {
		
		super();
	}
	
	
	private static ClassImmutabletest getclassimmutabletest() {
		
		if(classimmutabletest == null) {
			classimmutabletest = new ClassImmutabletest();
		}
		return classimmutabletest;
	}
	public static void main(String[] args) {
		
		ClassImmutabletest clt = getclassimmutabletest();
	}
}
