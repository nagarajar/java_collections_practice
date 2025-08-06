package practice.java.collections.c.sortarray;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
//		return Double.compare(o2.getSalary(), o1.getSalary()); //DSC
		return Double.compare(o1.getSalary(), o2.getSalary()); //ASC
	}

}
