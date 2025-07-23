package practice.java.collections.sortarray;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	//1. characteristics 
	private int id;
	private String name;
	private double salary;
	
	//2. Constructors
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	//3. getters and setters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//4. equal and hash code
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Employee current = (Employee)obj;
		
		return id == current.id;
	}
	
	
	//5. to string
	@Override
	public String toString() {
		return "Employee: { id="+this.id+", name="+this.name+", salary="+this.salary+" }";
	}
	
	//6. TO resolve this sorting issue in Employee we need to implement Comparable in Employee
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
//		return (x < y) ? -1 : ((x == y) ? 0 : 1);
//		return (this.id < o.id) ? -1 : ((this.id == o.id) ? 0 : 1);
		return Integer.compare(this.id, o.id);
	}
	
}
