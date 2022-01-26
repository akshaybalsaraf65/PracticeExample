package PraacticeExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMDOPEN {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*
		 * Runtime rt = Runtime.getRuntime(); try { rt.exec(new
		 * String[]{"cmd.exe","/c","start"}); } catch (Exception e) { // TODO: handle
		 * exception e.printStackTrace(); }
		 */
		
		ProcessBuilder builder = new ProcessBuilder(new String[]{"cmd.exe","/c","start"});
		builder.redirectErrorStream(true);
		
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while(true) {
			line = r.readLine();
			
			
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
	}

}
