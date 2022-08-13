import java.text.DecimalFormat;
import java.math.RoundingMode;

public class NetSalary {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		float grossSalary = 5000.23521f;
		float tax = 800.6672883f;
		float medical = 400.1235f;
		float netSalary;
		
		netSalary = grossSalary - tax - medical;
		
		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println("Net Salary: " + df.format(netSalary));
		
		df.setRoundingMode(RoundingMode.UP);
		System.out.println("Net Salary: " + df.format(netSalary));
		
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		System.out.println("Net Salary: " + df.format(netSalary));
		
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println("Net Salary: " + df.format(netSalary));

	}

}
