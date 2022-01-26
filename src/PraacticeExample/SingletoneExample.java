package PraacticeExample;

public class SingletoneExample {

	private static SingletoneExample singletoneExample = null;
	
	public static SingletoneExample getSingletoneExampleInstance() {
		
		if(singletoneExample == null) {
			singletoneExample = new SingletoneExample();
		}
		
		return singletoneExample;
		
	}
	
	{
		System.out.println("Before call singletone");
		
		getSingletoneExampleInstance();
		
		System.out.println("After call singletone");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletoneExample se = new SingletoneExample();
		//int hashCode = se.hashCode();
		//System.out.println(hashCode);
	}

}
