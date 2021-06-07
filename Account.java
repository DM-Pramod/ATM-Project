import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private Long customerNumber;
	private int pinNumber;
	private double currentAccountBalance;
	private double savingsAccountBalance;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
   
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public Long getCustomerNumber() {
		return customerNumber;
	}
	
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	
	public double getSavingsAccountBalance() {
		return savingsAccountBalance;
	}
	
	public double calcCurrentWithdraw(double amount) {
		currentAccountBalance = currentAccountBalance - amount;
		return currentAccountBalance;
	}
	
	public double calcSavingsWithdraw(double amount) {
		savingsAccountBalance = savingsAccountBalance - amount;
		return savingsAccountBalance;
	}
	
	public double calcCurrentDeposit(double amount) {
		currentAccountBalance = currentAccountBalance + amount;
		return currentAccountBalance;
	}
	
	public double calcSavingsDeposit(double amount) {
		savingsAccountBalance = savingsAccountBalance + amount;
		return savingsAccountBalance;
	}
	
	public void getCurrentAccountWithdrawInput() {
		System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentAccountBalance()));
		System.out.println("Amount you want to withdraw from Current Account: ");
		double amount = input.nextDouble();
		
		if((currentAccountBalance - amount )>=0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: "+moneyFormat.format(getCurrentAccountBalance()));
		}
		else {
			System.out.println("Balance cannot be negative."+"\n");
		}
	}
	
	public void getSavingsAccountWithdrawInput() {
		System.out.println("Savings Account Balance: "+moneyFormat.format(getSavingsAccountBalance()));
		System.out.println("Amount you want to withdraw from Savings Account: ");
		double amount = input.nextDouble();
		
		if((savingsAccountBalance - amount )>=0) {
			calcSavingsWithdraw(amount);
			System.out.println("New Savings Account Balance: "+moneyFormat.format(getSavingsAccountBalance()));
		}
		else {
			System.out.println("Balance cannot be negative."+"\n");
		}
	}
	
	public void getCurrentAccountDepositInput() {
		System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentAccountBalance()));
		System.out.println("Amount you want to Deposit to Current Account: ");
		double amount = input.nextDouble();
		
		
			calcCurrentDeposit(amount);
			System.out.println("New Current Account Balance: "+moneyFormat.format(getCurrentAccountBalance()));
		
	}
	
	public void getSavingsAccountDepositInput() {
		System.out.println("Savings Account Balance: "+moneyFormat.format(getSavingsAccountBalance()));
		System.out.println("Amount you want to Deposit to Savings Account: ");
		double amount = input.nextDouble();
		
		
			calcSavingsWithdraw(amount);
			System.out.println("New Savings Account Balance: "+moneyFormat.format(getSavingsAccountBalance()));
		
	}
}
