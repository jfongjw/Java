import java.text.DecimalFormat;
import java.math.RoundingMode;

public class TwoDecimals {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		float total_cost = 500.25f;
	    float item = 2f;
	    float price = total_cost / item;
	    
	    df.setRoundingMode(RoundingMode.HALF_UP);
	    System.out.println("Price: " + df.format(price));
	    
	    df.setRoundingMode(RoundingMode.UP);
	    System.out.println("Price: " + df.format(price));
	    
	    df.setRoundingMode(RoundingMode.HALF_DOWN);
	    System.out.println("Price: " + df.format(price));
	    
	    df.setRoundingMode(RoundingMode.DOWN);
	    System.out.println("Price: " + df.format(price));
	}

}
