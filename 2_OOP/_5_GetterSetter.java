public class _5_GetterSetter {
	public static void main(String[] args) {

// 										Public	Private	Protected	Default
// Same class							  ✔️		  ✔️		  ✔️			✔️
// Same package subclass			  ✔️		  ❌		 ✔️		  ✔️
// Same package non-subclass		  ✔️		  ❌		 ✔️		  ✔️
// Different package subclass		  ✔️		  ❌		 ✔️		  ❌
// Different package non-subclass  ✔️		  ❌		 ❌			 ❌

		Company company = new Company("IBM", 1991);
		company.setCEO("Arvind Krishna");
		company.setEmpCout(1200000);

		String name = company.CompanyName;
		int year = company.year;
		// String ceo = company.ceo; // Error
		String ceo = company.getCEO();
		// int count = company.EmpCount; // Error
		int count = company.getEmpCount();

		System.out.printf("\n%s was started in the year %d, now the CEO was %s with %,d employees\n", name, year, ceo, count);
	}
}
