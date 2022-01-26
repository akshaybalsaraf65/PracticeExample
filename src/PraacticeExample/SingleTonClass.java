package PraacticeExample;

public class SingleTonClass {

	private static SingleTonClass obj = null;

    private SingleTonClass() {
        System.out.println("Private Constructor is called");
    }

    public static SingleTonClass CreateObj() {
        if (obj == null) {
            obj = new SingleTonClass();
        }
        return obj;
    }

    public void display() {
        System.out.println("The Ojecte creation complete");
    }

    public void display1() {
        System.out.println("The second obj creation is comeplete");
    }
    
    public static void main(String[] args) {
        SingleTonClass stc = new SingleTonClass();
        SingleTonClass stc1 = new SingleTonClass();
        SingleTonClass stc2 = new SingleTonClass();
        // stc.display();
        // stc1.display1();

    }
}
