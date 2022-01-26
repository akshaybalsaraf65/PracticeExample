package PraacticeExample;

public final class ClassImmutable {

	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public ClassImmutable() {
		super();
	}
	public ClassImmutable(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
}
