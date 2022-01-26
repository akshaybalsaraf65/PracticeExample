package PraacticeExample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDriectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String directoryName = System.getProperty("user.dir");
		System.out.println("Current Working Directory is = " + directoryName);
		
		Path path = Paths.get("");
		String directoryNames = path.toAbsolutePath().normalize().toString();
		System.out.println("Current Working Directory is = " + directoryNames);
	}

}
