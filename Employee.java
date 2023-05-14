package association;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	Company comp;//has-a relationship
	public Employee(int employeeId, String employeeName, double salary, Company comp) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", comp=" + comp + "]";
	}
	
}
