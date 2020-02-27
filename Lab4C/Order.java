import java.time.LocalDate;
import java.util.Date;


public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;

	public Order(String oN, LocalDate oD, double oA) {
		this.orderNo = oN;
		this.orderDate = oD;
		this.orderAmount = oA;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public double getOrderAmount() {

		return orderAmount;

	}	

}