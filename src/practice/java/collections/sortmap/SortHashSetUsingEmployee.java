package practice.java.collections.sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import practice.java.collections.sortarray.Employee;

public class SortHashSetUsingEmployee {
	public static void main(String[] args) {
		//1. Sort the hash set using the employee
		Set<Employee> empHashSet = new HashSet<>();
		empHashSet.add(new Employee(100, "A", 1000.25));
		empHashSet.add(new Employee(105, "B", 2000.25));
		empHashSet.add(new Employee(102, "D", 500.25));
		empHashSet.add(new Employee(106, "M", 6000.25));
		empHashSet.add(new Employee(103, "L", 2500.25));
		empHashSet.add(new Employee(107, "O", 3500.25));
		
		System.out.println("Set before sorting: "+empHashSet);
		
		//2. Solution convert set to list the use the Collections.sort
		List<Employee> empList = new ArrayList<>(empHashSet);
		//3. Sort by employee name
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("Set before sorting by name: "+empList);
		//4. Sort by employee Salary
		Collections.sort(empList, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getSalary(),o2.getSalary());
			}
		});
		System.out.println("Set before sorting by salary: "+empList);
	}
}
