package PraacticeExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example2 implements example,Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example2 e = new Example2();
		e.show();
		
		example.display();
		Example1.display();
		
		List<Integer> values = Arrays.asList(4,5,8,6,2,10);
		
		System.out.println(values);
		
		for(int i = 0; i< values.size(); i++) {
			
			System.out.println(values.get(i));
		}
		
		for(int i : values) {
			
			System.out.println(i);
		}
		
		values.forEach(i -> System.out.println(i));
		
		//values.forEach(i -> System.out::println(i));
		
		Consumer<Integer> c = new ConsumerExample();
		values.forEach(c);
		
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		example.super.show();
		
		System.out.println("first class");
	}

}
