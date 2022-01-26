package PraacticeExample;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

public class StringTOIntConvertWithoutUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "12345";
		System.out.println(str);
		int convertStringTOInt = convertStringTOInt(str);
		System.out.println(convertStringTOInt);
		convertString(str);
		
	}
	
	public static int convertStringTOInt(String str) {
		
		int i =0,number=0;
		boolean flag = false;
		int strlength = str.length();
		
		if(str.charAt(0) == '0') {
			flag = true;
			i = 1;
		}
		
		while(i < strlength) {
			number = number * 10;
			number +=(str.charAt(i++)-'0');
			
		}
		
		if(flag) {
			number = -number;
		}
		
		return number;
	}
	
	public static void convertString(String str) {
		
		int num = 0;
		int n = str.length();
		
		for(int i = 0;i< n;i++) {
			//((str[i])-48)
			num = num * 10 + str.charAt(i)-48;
			
			
		}
		System.out.println(num);
	}

}
