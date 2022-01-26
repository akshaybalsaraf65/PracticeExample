package JavaToJsonANDJSONToJava;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.SetSid(1);
		s.SetName("ak");
		s.SetMarks(1);
		
		Address a = new Address();
		a.SetFlatno(1);
		a.SetArea("kk");
		a.SetBuildingName("kk");
		
		s.SetAddress(a);
		
		ObjectMapper mapper = new ObjectMapper();
		
		Object Student;
//		mapper.writeValue(new File("Student.json"), Student);
		System.out.println("Json generated");

	}

}
