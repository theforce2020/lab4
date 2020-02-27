

public class Salaried extends Employee{
	private double salary;

	public Salaried(String eId, double s) {
		super(eId);
		this.salary = s;
	}

	//@Override
	public double calcGrossPay(int m, int y) {
		// TODO Auto-generated method stub
		return salary;

	}


}
