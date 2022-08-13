import java.util.Scanner;

public class ArrayCalculation {

	public static void main(String[] args) {

		// initialize an array of size 10
		int[] myArray = new int [10];
		
		// declare and initialize sum and average
		int sum = 0;
		int avg;
		
		// Create a Scanner sc to capture input from user
		Scanner sc = new Scanner (System.in);
		
		// Ask user to enter 10 number and store into an array using for loop
		System.out.println("Please enter 10 numbers: ");
		
		// Store the values into the array using for_each loop
		/*for(int i : myArray) {
			myArray[i] = sc.nextInt();
			//System.out.println(myArray[i]);
		}
		*/
		
		// Store the values into the array using simple for loop
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
			//System.out.println(myArray[i]);
		}
		
		// Close the scanner
		sc.close();
		
		for(int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		
		System.out.println("My sum is: " + sum);
		
		avg = sum / myArray.length;
		System.out.println("My average is: " + avg);
		
		
		int max = myArray[0];
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > max) {
				max = myArray[i];
			}
		}
		System.out.println("Maximum value is: " + max);
		
		int min = myArray[0];
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println("Minimum value is: " + min);
	}

}