// import Scanner class from java.util (Scanner in Java is use for reading input from user)
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		// declaring variable
		int num1, num2, sum;
		
		// using a Scanner class to read input from user
		Scanner sc = new Scanner (System.in);
		
		
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        // close the Scanner when it is no longer needed
        sc.close();
        
        // calculate the sum of num1 and num2, then print out the result
        sum = num1 + num2;
        System.out.println("Sum: " + sum);
	}

}
