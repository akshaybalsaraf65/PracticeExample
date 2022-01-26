package Collection;

import java.util.Comparator;

public class CollectionTreesetComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer i = (Integer) o1;
		Integer i2 = (Integer) o2;
		
//		if(i < i2) {
//			return +1;
//		}
//		else if(i > i2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		return -i.compareTo(i2);
		
	}

}
