package PraacticeExample;

public class ArrayReverseOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,1,2,44,5};
		int distinctIntegers = 0;
		for(int j = 0; j< array.length; j++) {
			
			int thisInt = array[j];
			System.out.print(thisInt);
			
			boolean seenThisIntBefore = false;
			
			for(int i = 0;i<j;i++) {
				
				if(thisInt == array[i]) {
					
					seenThisIntBefore = true;
				}
				
				if (!seenThisIntBefore)
			    {
			        distinctIntegers++;
			    }
			}
		}
		
		
		for(int k= 0;k<array.length;k++) {
			
			int m;
			for(m = 0;m < k;m++) {
				
				/*
				 * if(array[k] == array[m]) { break; }
				 */
				
				if(k == m) {
					
					System.out.println(array[k] + "dddd");
				}
			}
		}
		
		System.out.println();
		
		int n = array.length;
		printDistinct(array, n);
	}
	
	 static void printDistinct(int arr[], int n)
	    {
	        // Pick all elements one by one
	        for (int i = 0; i < n; i++)
	        {
	            // Check if the picked element 
	            // is already printed
	            int j;
	            for (j = 0; j < i; j++)
	            if (arr[i] == arr[j])
	                break;
	      
	            // If not printed earlier, 
	            // then print it
	            if (i == j)
	            System.out.print( arr[i] + " ");
	        }
	    }

}
