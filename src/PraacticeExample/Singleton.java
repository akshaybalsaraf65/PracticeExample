package PraacticeExample;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // This is called only once
        System.out.println("Private Constructor is called");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
    
    public static void main(String[] args) {

        // Even if you ask 100 times, this will only return the same INSTANCE
        Singleton stc  = Singleton.getInstance();
        Singleton stc1 = Singleton.getInstance();
        Singleton stc2 = Singleton.getInstance();

        Singleton stc3 = new Singleton();
        stc.getInstance();
    }
    
}
