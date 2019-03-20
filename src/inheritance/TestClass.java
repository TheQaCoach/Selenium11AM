package inheritance;

public class TestClass {

	public static void main(String a[]) {
		PNB_CASH_VENDING pnb = new PNB_CASH_VENDING("PNB");
		pnb.generatePIN();
		pnb.cashWithdrawl();
		pnb.generateReceipt();
		pnb.displayBank();
		pnb.cashDeposit();
		
		PNBATM pnbbb = new PNBATM("PNBBBB");
		pnbbb.cashDeposit();
		
		OBCATM obc = new OBCATM("OBC");
		obc.generatePIN();
		obc.cashWithdrawl();
		obc.generateReceipt();
		obc.displayBank();
		
	}	
}
