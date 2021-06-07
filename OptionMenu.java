import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	int selection ;
	HashMap<Long, Integer> data = new HashMap<Long,Integer>();
	
	public void getLogin() throws IOException {
		int x =1;
		do {
			try {
				data.put(9845462353L, 1608);
				data.put(7676223788L, 0412);
				data.put(8197990599L,2312);
				data.put(9739955073L, 2512);
				System.out.println("Welcome to ATM Project");
				
				System.out.println("Enter your customer number:");
		        setCustomerNumber(menuInput.nextLong());
				
				System.out.println("Enter your PIN number:");
				setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				System.out.println("\n" +"Invalid Characters" +"\n");
				x=2;
				
			}
			for (Map.Entry<Long, Integer> set : data.entrySet())
			 {
				if(set.getKey() == getCustomerNumber() && set.getValue() == getPinNumber()) {
					getAccountType();
				
				}
			}
			System.out.println("\n" +"Wrong Customer Number or PIN Number" +"\n");
		}while(x==1);
	}
	
	
	public void getAccountType() {
		System.out.println("Select the Account Type: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Savings Account:");
		System.out.println("Type 3 - EXIT");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1: getCurrent();
		break;
		
		case 2 : getSavings();
		break;
		
		case 3 : System.out.println("ThankYou for using PAO ATM");
		break;
		
		default : System.out.println("\n"+"Invalid Choice"+"\n");
		getAccountType();
		}
	}	
		public void getCurrent() {
			System.out.println(" CURRENT ACCOUNT");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - EXIT");
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:  System.out.println("Checking Current Account balance :" +moneyFormat.format(getCurrentAccountBalance()));
			break;
			
			case 2 : getCurrentAccountWithdrawInput();
			getAccountType();
			break;
			
			case 3 : getCurrentAccountDepositInput();
			getAccountType();
			break;
			
			case 4 : System.out.println("ThankYou for using PAO ATM");
			break;
			
			default : System.out.println("\n"+"Invalid Choice"+"\n");
			getCurrent();
			}
			
			
		}	
		
		public void getSavings() {
			System.out.println(" SAVINGS ACCOUNT");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - EXIT");
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:  System.out.println("Checking Savings Account balance :" +moneyFormat.format(getSavingsAccountBalance()));
			break;
			
			case 2 : getSavingsAccountWithdrawInput();
			getAccountType();
			break;
			
			case 3 : getSavingsAccountDepositInput();
			getAccountType();
			break;
			
			case 4 : System.out.println("ThankYou for using PAO ATM");
			break;
			
			default : System.out.println("\n"+"Invalid Choice"+"\n");
			getSavings();
			}
			
		}	
		
}  
