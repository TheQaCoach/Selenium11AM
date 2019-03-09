package inheritance;

public class PNBATM extends ATM{
	
	public PNBATM(String bankName) {
		super(bankName);
	}

	public void cashDeposit() {
		System.out.println("Cash Deposit");
	}
	
}
