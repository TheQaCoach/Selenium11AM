package inheritance;

public class ATM {

	public ATM(String bankName)
	{
		this.bankName = bankName;
		displayBank();
	}
	
	public ATM()
	{
		displayBank();
	}
	
	String bankName;
	
	public void displayBank() {
		System.out.println(bankName);
	}
	
	public void cashWithdrawl() {
		System.out.println("Cash Withdraw");
	}

	public void generateReceipt() {
		System.out.println("Generate Receipt");
	}
	
	public void generatePIN() {
		System.out.println("Generate PIN");
	}
}
