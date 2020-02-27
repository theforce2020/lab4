
public class hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;
	public hourly(String eId, double hW, double hPW) {

		super(eId);
		this.hourlyWage = hW;
		this.hoursPerWeek = hPW;

	}

	@Override

	public double calcGrossPay(int m, int y) {
		// TODO Auto-generated method stub
		return hourlyWage*hoursPerWeek*4;

	}



}


