package PraacticeExample;

public class HighestOccurenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,2,1,5,6,6,6,6,6,8,5,9,7,1};
		int max = 0 ; int chh = 0;
//	    int count[] = new int[a.length];
//	    for(int i = 0 ; i <a.length ; i++) {
//	    	int ch = a[i];
//	        count[ch] +=1 ;
//	    }
//	    
//	    for(int i = 0 ; i <a.length ;i++)  {
//	    	int ch = a[i];
//	        if(count[ch] > max) {max = count[ch] ; chh = ch ;}
//	    }
//	    
//	    System.out.println(chh);
		
		for(int i = 0;i< a.length; i++) {
			int count = 0;
			
			for(int j = 0; j< a.length; j++) {
				
				if(a[i] == a[j]) {
					count++;
				}
			}
			
			if(count >= max) {
				
				max = count;
			}
		}
		
		System.out.println(max);
	}

}
