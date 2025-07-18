package practice.java.collections.map;

import java.util.Objects;

public class Department {
	private int deptId;
	private String deptName;
	
	public Department() {
		
	}
	
	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deptId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || getClass() != this.getClass()) {
			return false;
		}
		
		Department other = (Department)obj;
		return deptId == other.deptId;
	}
	
	@Override
	public String toString() {
		return "Department: { deptId="+this.deptId+", deptName="+this.deptName+" }";
	}
}
