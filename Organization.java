package association;

public class Organization {

	public static void main(String[] args) {
		Company obj = new Company(111,"Infosys");
		Employee e1 = new Employee(1,"Java",45000,obj);
		Employee e2 = new Employee(2,"Oracle",55000,obj);
		System.out.println(e1);
		System.out.println(e2);

	}

}
