package interfacediffpackage;

import interfaces.Bank;

public class ICICIBank implements Bank{

	@Override
	public void accountopen() {
		System.out.println("Open bank account in ICICI");
	}
	
	public void loan()
	{
		System.out.println("Grant Loan");
	}
	

}
