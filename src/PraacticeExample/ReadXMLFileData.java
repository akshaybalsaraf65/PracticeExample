package PraacticeExample;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.xml.internal.txw2.Document;

public class ReadXMLFileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("");
		String directoryName = path.toAbsolutePath().normalize().toString();
		try {
			
		
		File file = new File(directoryName+"\\" +"companyemployeedatadetails.xml");
		System.out.println(file);
		if(file.isFile()) {
			System.out.println("directory present");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document document = db.parse(file);
			document.getDocumentElement().normalize();
			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
			NodeList nList = document.getElementsByTagName("Employee");
			System.out.println("--------------------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Employee id : " + eElement.getAttribute("id"));
					System.out.println("Employee FirstName : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
					System.out.println("Employee LastName : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
					System.out.println("Employee ContactNo : " + eElement.getElementsByTagName("ContactNo").item(0).getTextContent());
					System.out.println("Employee Email : " + eElement.getElementsByTagName("Email").item(0).getTextContent());
					System.out.println("Employee Address : " + eElement.getElementsByTagName("Address").item(0).getTextContent());
					NodeList nNodeAddress = eElement.getElementsByTagName("Address");
					
					System.out.println("----------------------Address Details--------------------------");
					for (int tempadd = 0; tempadd < nNodeAddress.getLength(); tempadd++) {
						Node nNodeAdd = nNodeAddress.item(tempadd);
						System.out.println("\nCurrent Address : " + nNodeAdd.getNodeName());
						if(nNodeAdd.getNodeType() == Node.ELEMENT_NODE) {
							Element eElementAdd = (Element) nNodeAddress;
							System.out.println("Employee City : " + eElementAdd.getElementsByTagName("City").item(0).getTextContent());
							System.out.println("Employee State : " + eElementAdd.getElementsByTagName("State").item(0).getTextContent());
							System.out.println("Employee Zip : " + eElementAdd.getElementsByTagName("Zip").item(0).getTextContent());
						}
					}
				}
			}
		}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
