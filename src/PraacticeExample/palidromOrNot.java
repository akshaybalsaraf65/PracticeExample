package PraacticeExample;

public class palidromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		int r;
		int sum = 0;
		
		int n =545;
		
		temp = n;
		
		while(n>0) {
			
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("palindrom number");
		}else {
			System.out.println("not palindrom number");
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("String palindrom or Not");
		String pal = "aba";
		String rev = "";
		
		for(int i = pal.length()-1; i >= 0;i--) {
			rev = rev + pal.charAt(i);
		}
		if(pal.equals(rev)) {
			System.out.println("String is palindrom String");
		}else {
			System.out.println("String is not palindrom String");
		}
		System.out.println("------------------------------------------------------");
	}

}
