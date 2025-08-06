package practice.java.collections.c.sortarray;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		//1. create the integer list then sort it
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(1);
		l.add(6);
		l.add(3);
		l.add(2);
		l.add(4);
		
		System.out.println("Before sort: "+l);
		
		//2. Sort using the Collections
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println("After sort: "+l);
		
		
		//3. Sort the Employee ? Question: based on which field : ID
		List<Employee> el = new ArrayList<Employee>();
		el.add(new Employee(100, "A", 1000.25));
		el.add(new Employee(105, "B", 2000.25));
		el.add(new Employee(102, "D", 500.25));
		el.add(new Employee(106, "M", 6000.25));
		el.add(new Employee(103, "L", 2500.25));
		el.add(new Employee(107, "O", 3500.25));
		
		System.out.println("Emp List before sort: "+el);
		
		//4. Sort using collections
//		Collections.sort(el); 
		//CTE: The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Employee>)
		//Because: Integer class implements Comparable::compareTo, All WrapperClasses implements thats y collections.sort works fine.
		
		//5. TO resolve this issue in Employee we need to implement Comparable in Employee
		Collections.sort(el);
		System.out.println("Emp List after sort by id: "+el);
		
		//6. Currently we are sorting by id in the Employee, what if you have to sort based on other fields based on name, salary ?
		// Are you going to update the compareTo implementation every time ? Its not recommended
		// Comparable is standard sorting based on kind of primary/Unique key - so we can change the implementation every time ? what is the alternate
		// Comparator is the alternate for the Comparable, so we need 
		//	1. create the class which implements the Comparator::compare
		//		1.1 EmployeeSortByName	
		//	2. then in collections sort is accepting list and the comparator use that to sort based on required field without change standard sorting.
		//  2.1 sort by name
		Collections.sort(el, new EmployeeSortByName());
		System.out.println("Emp List after sort by name: "+el);
		//	2.2 sort by salary
		Collections.sort(el, new EmployeeSortBySalary());
		System.out.println("Emp List after sort by salary: "+el);
		
		
	}
}
