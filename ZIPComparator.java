import java.util.*;
public class ZIPComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Contact c1=(Contact)o1;  
		Contact c2=(Contact)o2;  
		int compares=(int)c1.ZIP.compareTo(c2.ZIP);
		return compares;
	}
}
