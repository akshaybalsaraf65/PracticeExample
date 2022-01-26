package PraacticeExample;

import java.io.File;

public class RecursiveFileDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("E:\\akshay\\Java\\PrcticeExample\\PracticeExample\\src\\PraacticeExample"); // current directory
		displayDirectoryContents(file);
	}
	
	public static void displayDirectoryContents(File dir) {
		
		try {
			File[] listFiles = dir.listFiles();
			for(File file : listFiles) {
				if(file.isDirectory()) {
					
					displayDirectoryContents(file);
				}else {
					if(file.getName().endsWith((".java"))) {
						
						System.out.println("    file:" + file.getCanonicalPath());
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			
			e.printStackTrace();
		}
	}

}
