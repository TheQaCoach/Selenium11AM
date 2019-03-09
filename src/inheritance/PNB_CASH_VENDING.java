package inheritance;

public class PNB_CASH_VENDING extends PNBATM{

	@Override
	public void cashDeposit() {
		System.out.println("Cash Deposit from Vending Machine");
	}
	
	public PNB_CASH_VENDING(String bankName) {
		super(bankName);
	}
	
}
