
public abstract class Employee {
	private String empid;
	
	public Employee(String empid)
	{
		this.empid = empid;
	}

	public void print(int m, int y) {
		System.out.println("Employee Id: " + empid);
		Paycheck paycheck = calcCompensation(m, y);
		paycheck.print();

	}

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay);

	}	

	abstract public double calcGrossPay(int m, int y);

}
