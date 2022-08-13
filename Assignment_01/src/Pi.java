import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circumference;
		double diameter;
		double pi;
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("Enter the circumference: ");
		circumference = myScanner.nextDouble();
		
		System.out.println("Enter the diameter: ");
		diameter = myScanner.nextDouble();
		
		myScanner.close();
		
		pi = circumference / diameter;
		
		System.out.println(pi);
	}

}
