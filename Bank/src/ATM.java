import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t Welcome to MoneyBank ATM! \n");
		System.out.print("Menu \n");
		System.out.println("\t\t\t\t\t Balance: " + balance);
		System.out.println("\t Please choose your option: \n");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance");
		System.out.println("*****************");
		int menuOption = sc.nextInt();
		
		switch(menuOption) {
			case 1:
				System.out.println("Please enter the amount to withdraw: ");
				int withdrawAmount = sc.nextInt();
				balance -= withdrawAmount;
				if(balance <= 0) {
					System.out.println("Insufficient Fund!");
				}else {
					System.out.println("Current balance is: " + balance);
				}
				break;
			case 2:
				System.out.println("Please enter the amount to deposit: ");
				int depositAmount = sc.nextInt();
				balance += depositAmount;
				System.out.println("Current balance is: " + balance);
				break;
			case 3:
				System.out.println("Current balance is: " + balance);
				break;
			default:
				System.out.println("Invalid Option!");
				break;
		
		}
		
		sc.close();
	}

}
