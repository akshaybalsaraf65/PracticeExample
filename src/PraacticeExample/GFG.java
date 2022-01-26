package PraacticeExample;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiating Singleton class with variable x
		
        Singletonn x = Singletonn.getInstance();
 
        // Instantiating Singleton class with variable y
        Singletonn y = Singletonn.getInstance();
 
        // Instantiating Singleton class with variable z
        Singletonn z = Singletonn.getInstance();
        
        System.out.println("Hashcode of x is "
                + x.hashCode());
System.out.println("Hashcode of y is "
                + y.hashCode());
System.out.println("Hashcode of z is "
                + z.hashCode());

// Condition check
if (x == y && y == z) {

 // Print statement
 System.out.println(
     "Three objects point to the same memory location on the heap i.e, to the same object");
}

else {
 // Print statement
 System.out.println(
     "Three objects DO NOT point to the same memory location on the heap");
}
	}

}
