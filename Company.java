package association;

public class Company {
	int companyId;
	String companyName;
	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	

}
