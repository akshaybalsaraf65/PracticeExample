package StarPattern;

public class demoPattern {

	
	public static void main(String[] args) {
		
		
		int row = 4;
		for(int i = 0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------");
		
		
		int row1 = 6;
		/*
		 * for(i = 0; i<row;i++) { for(j=row-1;j>1;j--) { System.out.print(" "); } for(j
		 * = 0;j<=1;j++) { System.out.print("*"); } System.out.println(); }
		 */
		
		for(int x = 0;x<row1;x++) {
			int y;
			for(y = row1-1;y>1;y--) {
				System.out.print(" ");
			}
			
			for(y = 0;y<=x;y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
