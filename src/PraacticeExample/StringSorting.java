package PraacticeExample;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int str[] = {10,45,58,54,56,45,25};
		
		for(int i = 0;i<str.length;i++) {
			for(int j = i+1;j<str.length;j++) {
				
				int temp = 0;
				if(str[i] > str[j]) {
					
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				
			}
			System.out.print(str[i] + ",");
		}
		
		String strarr[] = {"ak","akshay","vishal","pratik","bhurya","tejasvi"};
		
		for(int i = 0; i<strarr.length;i++) {
			for(int j = i + 1; j < strarr.length;j++) {
				
				if(strarr[i].compareTo(strarr[j]) > 0) {
					
					String temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
			
			System.out.print(strarr[i] + ",");
		}

}
}
