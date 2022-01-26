package PraacticeExample;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10,50,40,30,80,90,40,20,5};
		
		for(int x = 0;x<array.length;x++) {
		
			System.out.print(array[x] + " , ");
		}
		
		System.out.println();
		
		for(int i = 0; i< array.length-1;i++) {
			
			for(int j = 0; j< array.length-i-1;j++) {
				
				if(array[j] > array[j+1]) {
					int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		
		for(int z = 0;z<array.length;z++) {
			
			System.out.print(array[z] + " , ");
		}
		
	}

}
