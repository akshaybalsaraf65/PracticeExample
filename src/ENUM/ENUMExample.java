package ENUM;


public class ENUMExample implements num{
	
	enum ENUMExample1 {

		KF,RC,PQ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ENUMExample1 en = ENUMExample1.RC;
		System.out.println(en);
		switch(en) {
		
		case KF :
			System.out.println("KF is here");
			break;
			
		case RC :
			System.out.println("RC is here");
			break;
			
		default :
			System.out.println("ANYONE is here");
			break;
		}
		
		ENUMExample1[] en1 = ENUMExample1.values();
		for(ENUMExample1 enn : en1) {
			System.out.println(enn + " " + en.ordinal());
		}
		System.out.println(en1);
	}

}
