import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empid, double com, double base, List<Order> or)
	{
	super(empid);
	this.commission = com;
	this.baseSalary = base;
	orders = or; 
	}
	
	@Override
	public double calcGrossPay(int m, int y) {
		// TODO Auto-generated method stub

		double result = baseSalary;
		double totalOrderAmount = 0.0;
		for(Order o :orders) {		
			
			if((m - 1) ==o.getOrderDate().getMonthValue() && y==o.getOrderDate().getYear())
{			
				totalOrderAmount += o.getOrderAmount();

			}
		}	
		result += totalOrderAmount*commission;
		return result;

	}
	
}
	

