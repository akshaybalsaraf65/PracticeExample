package PraacticeExample;

public class StringRepeatOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "akshay";  
        int count;  
        
        char[] stringdata = string1.toCharArray();
        
        for(int i = 0;i<stringdata.length;i++) {
        	
        	count = 1;
        	for(int j =i+1;j<stringdata.length;j++) {
        		
        		if(stringdata[i] == stringdata[j]) {
        			
        			count++;
        			stringdata[j] = '0';
        		}
        	}
        	if(count > 1 && stringdata[i] != '0')
        		System.out.println(stringdata[i] + "" + count);
        }
	}

}
