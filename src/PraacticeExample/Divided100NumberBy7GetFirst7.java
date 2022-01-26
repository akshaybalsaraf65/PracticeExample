package PraacticeExample;

public class Divided100NumberBy7GetFirst7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		System.out.println("No. divisible by 7 in between 0 and 100");
		int count = 0;
		for(i = 0; i<= 100; i++) {
			
			if(i%7 == 0) {
				
				if(count < 7) {
					
					System.out.println(i + "," + count);
					
				}
				
				count++;
				
			}
			
			//System.out.println(count);
			
		}
	}

}
