package Numberguessing;

import java.util.Scanner;

public class GuessTheNumber {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int choice;
		double balance = 0;
		boolean isrunning = true;
		int pin = 123456;
		
		System.out.print("Enter PIN : ");
		int pass = scanner.nextInt();
		
		if(pin == pass) {
			while(isrunning) {
				System.out.println("*****BANKING PROGRAM*****");
				System.out.println("1. SHOW BALANCE");
				System.out.println("2. DEPOSIT");
				System.out.println("3. WITHDRAW");
				System.out.println("4. EXIT");
				System.out.println("*************************");
				
				
				System.out.print("Enter Your choice (1 - 4) :");
				choice = scanner.nextInt();
				
				switch(choice) {
				case 1:
					showbalance(balance);
					break;
				case 2:
					balance += deposit();
					break;
				case 3:
					balance -= withdraw(balance);
					break;
				case 4:
					isrunning = false;
					break;
				default:
					System.out.println("Invalid choice");
				}
			}
		}
		else {
			System.out.println("INVALID PIN");
		}
		scanner.close();
		System.out.println("*****************");
		System.out.println("     THANKS");
		System.out.println("*****************");
		
		
	}
	
	//balance------
	static void showbalance(double balance) {
		System.out.println("********************************************");
		System.out.println("    You'r Current Bank Balance is :" + "$"+balance);
		System.out.println("********************************************");
	}
	
	//deposit------
	static double deposit() {
		double amount;
		System.out.print("Enter an amount to deposit :");
		amount = scanner.nextDouble();
		System.out.println("******************************************************");
		System.out.println("    You are Deposited '" + amount +"' "+ "To You'r Bank account");
		System.out.println("******************************************************");
		
		if(amount < 0) {
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
	}
	
	//withdraw-----
	static double withdraw(double balance) {
		double amount;
		
		System.out.print("Enter an amount to withdrawn :");
		amount = scanner.nextDouble();
		System.out.println("*********************************************************");
		System.out.println("    You are withdrawn '" + amount + "' " + "To the You'r Account");
		System.out.println("*********************************************************");
		
		if(amount > balance) {
			System.out.println("Insufficient money");
			return 0;
		}
		else if(amount < 0) {
			System.out.println("amount can't be negative");
			return 0;
		}
		else {
			//System.out.println("*****************");
			return amount;
		}
	}
}
//successfully completed