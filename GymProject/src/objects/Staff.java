package objects;

public class Staff extends Members{
	
	protected String jobFunction;
	protected String salary;
	
	public Staff() {
		
		
	}
	
	public void setFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getFunction() {
		return this.jobFunction;
	}
	
	public String getSalary() {
		return this.salary;
	}

}
