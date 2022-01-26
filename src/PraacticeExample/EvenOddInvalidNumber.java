package PraacticeExample;

import java.util.Scanner;

public class EvenOddInvalidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		if(n>=0) {
			if(n%2==0) {
				
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("invalid");
		}
	}

}
