package interfaces;

import interfacediffpackage.ICICIBank;

public class TestClass {

	public static void main(String[] arg)
	{
		String bankName = "AXIS";
		
		/*
		 * AXISBANK axisobj = new AXISBANK(); axisobj.accountopen();
		 * 
		 * ICICIBank iciciobj = new ICICIBank(); iciciobj.accountopen();
		 * iciciobj.loan();
		 */
		
		Bank bankobj = null;
		if(bankName.equalsIgnoreCase("AXIS"))
		{
			bankobj = new AXISBANK();
		}else {
			bankobj = new ICICIBank();
		}
	
		bankobj.accountopen();

	}
	
}
