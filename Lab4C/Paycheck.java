
public final class Paycheck {
	private double grossPay;
	private final static double fica=0.23;
	private final static double state=0.05;
	private final static double local=0.01;
	private final static double medicare=0.03;
	private final static double socialSecurity=0.075;

	public Paycheck(double gP) {
		this.grossPay = gP;
	}

	public void print() {
		String str = "Paystub:" + "\n Gross Pay: " + grossPay +
		"\nFica: " + fica + "\nState: " + state + "\nLocal: " + local + 
		"\nMedicare: " + medicare + "\nSocial Security: " + socialSecurity + 
		 "\nNET PAY: " + getNetPay();
		System.out.println(str);		
	}

	public double getNetPay() {
		return grossPay - grossPay*fica - grossPay*state - grossPay*local - grossPay*medicare - grossPay*socialSecurity;		

		
	}

}
