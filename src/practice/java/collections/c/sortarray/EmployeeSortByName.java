package practice.java.collections.c.sortarray;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
//		return o2.getName().compareTo(o1.getName()); //DSC
		return o1.getName().compareTo(o2.getName()); //ASC
	}

}
