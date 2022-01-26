package PraacticeExample;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Encoder;

public class EncodingDecodingBase64Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "This is confidential";
		System.out.println("Message before encoding: "+ msg);
		try {
			byte[] bytes = msg.getBytes("UTF-8");
			Encoder encoder = Base64.getEncoder();
			String encoded = encoder.encodeToString(bytes);
			System.out.println("Message after encoding: "+ encoded);
			byte[] decoded = Base64.getDecoder().decode(encoded);
			String decodedMSG = new String(decoded);
			System.out.println("Decoded Message "+ decodedMSG);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
