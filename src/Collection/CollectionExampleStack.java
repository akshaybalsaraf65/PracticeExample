package Collection;

import java.util.Stack;

public class CollectionExampleStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("akaki");
		s.push("ak");
		s.push("akak");
		System.out.println(s);
		System.out.println(s.search("akaki"));
		System.out.println(s.search("j"));
	}
}
