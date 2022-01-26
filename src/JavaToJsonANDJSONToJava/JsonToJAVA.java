package JavaToJsonANDJSONToJava;

import java.io.Externalizable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsonToJAVA implements Externalizable{

	
	public int getDate(String str,int i) {
		
		return i;
	}
	
	public int getDate(int i) {
		
		return i;
	}
	
	public int getDate(int i,String str) {
		
		return i;
	}
	
	public String getDate(String str,String ssr) {
		
		return str;
	}
	public void getDate(String sst) {
		
		System.out.println("sstr");
	}
	
	private void getDate() {
		
		System.out.println("aa");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonToJAVA s = new JsonToJAVA();
		s.getDate();
		s.getDate("str");
		int i = s.getDate(0, null);
		System.out.println(i);
		ObjectMapper mapper = new ObjectMapper();
//		Student std = mapper.readValue(new File("Student.json"), Student);
//		
//		System.out.println(std.getSid());
//		System.out.println(std.getName());
//		System.out.println(std.getMarks());
//		System.out.println(std.getAddress());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
}
