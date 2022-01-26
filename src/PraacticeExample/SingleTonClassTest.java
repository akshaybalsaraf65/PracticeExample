package PraacticeExample;

public class SingleTonClassTest {

	public static void main(String[] args) {
        SingleTonClass stc=SingleTonClass.CreateObj();
        SingleTonClass stc1=SingleTonClass.CreateObj();
        SingleTonClass stc2=SingleTonClass.CreateObj();
    }
	
}
