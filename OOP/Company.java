public class Company {
	
	String CompanyName;
	int year;
	private String CEO;
	private int EmpCount;

	Company(String CompanyName, int year) {
		this.CompanyName = CompanyName;
		this.year = year;
	}
	void setCEO(String CEO) {
		this.CEO = CEO;
	}
	String getCEO() {
		return this.CEO;
	}
	void setEmpCout(int EmpCount) {
		this.EmpCount = EmpCount;
	}
	int getEmpCount() {
		return this.EmpCount;
	}
}
