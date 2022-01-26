package PraacticeExample;

public class NumberIspalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		int sum =0;
		int temp;
		int n = 454;
		
		temp = n;
		
		while(n>0) {
			
			r = n%10;
			sum = (sum *10)+ r;
			n = n/10;
		}
		
		if(temp == sum) {
			
			System.out.println("palindrom number");
		}else {
			
			System.out.println("not palindrom number");
		}
	}

}
