package PraacticeExample;

public class Singletonn {

	 // Static variable reference of single_instance
    // of type Singleton
    private static Singletonn single_instance = null;
 
    // Decl;aring a variable of type String
    public String s;
 
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    public Singletonn()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    // Static method
    // Static method to create instance of Singleton class
    public static Singletonn getInstance()
    {
        if (single_instance == null)
            single_instance = new Singletonn();
 
        return single_instance;
    }
}
