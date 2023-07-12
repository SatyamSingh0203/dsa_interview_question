package ComparatorComparable;

import java.util.Comparator;

public class IDComparator  implements Comparator<Emp>{
	
	

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
