import java.util.*;
class LastNameComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Contact c1=(Contact)o1;  
		Contact c2=(Contact)o2;  
		int compares=(int)c1.lastName.compareTo(c2.lastName);
		return compares;
	}
}
