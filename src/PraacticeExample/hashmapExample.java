package PraacticeExample;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		String str = "abdcadb"; // akshay
		//String stst = a
		
		for(int i = 0;i<str.length();i++) {
			
			for(int j =0;j<i;j++) {
				
			//	if()
			}
		}
		
		//String[] str
		
		for(int i = 0;i<str.length();i++) {
			
			char charAtstr = str.charAt(i);
			
			System.out.println(charAtstr);
			
			
			/*{1,2,3,4}
			true
			{1,2,4,3}
			false*/
			//if(charAtstr)
			/*
			 * for(int j =0; j< i;j++) {
			 * 
			 * 
			 * }
			 */
			
			
			int arr[] = {1,2,3,4};
			int arr1[] = {1,2,4,3};
			
			/*
			 * for(int k =0; k<arr.length;k++) {
			 * 
			 * 
			 * for(int m=0;m<arr1.length;m++) {
			 * 
			 * if(arr[k] == arr[m]) { System.out.println("true"); }else {
			 * System.out.println("false"); } } }
			 */
		

			String strsm = "sm*ile";
			
			StringBuffer strsms = new StringBuffer(strsm);
			
			//strsm.length()-2;
			
			int length = strsm.length();
			
			char firstletter = strsm.charAt(0);
			
			String lastcharacter = strsm.substring(strsm.length() - 2);
			
			System.out.println(firstletter + " " + lastcharacter);
			
		}
	}

}
