package Generics;

public class GenericsExample {

	
//	Generics :
//		
//		introduction
//		generics classes
//		bounded types
//		generics method and wild-card character (?)
//		communication with non-generic code
//		conclusions
	
	public static < E > void printArray(E[] element) {
		
		for(E Element:element) {
			System.out.println(Element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		MyGen<Integer> m1 = new MyGen<Integer>();
		m1.add(10);
		//m1.add("10");
		System.out.println(m1.get());
		
		MyGen<String> m2 = new MyGen<String>();
		m2.add("ak");
		System.out.println(m2.get());
		
		MyGen<Double> m3 = new MyGen<Double>();
		m3.add(10.5);
		System.out.println(m3.get());
		
		MyGen<Float> m4 = new MyGen<Float>();
		m4.add(10f);
		System.out.println(m4.get());
		
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
        String str = "akshay";
  
        System.out.println( "Printing Integer Array" );  
        printArray( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        printArray( charArray );   
        
        for(char c:charArray) {
        	System.out.println(c);
        }
        
	}
}
