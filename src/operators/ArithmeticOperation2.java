package operators;

public class ArithmeticOperation2 {

	public static void main(String arg[])
	{
		
		int p = 0;
		
		if(p==100) {
			System.out.println("Secured Full Marks");
		}else {
			System.out.println("Did not Secure Full Marks");
		}
		
		if(p>=80 && p<=100) {
			System.out.println("Percentage secured between 80 - 100");
		}else if(p>=60) {
			System.out.println("Percentage secured between 60 - 79");
		}else if(p>=40) {
			System.out.println("Percentage secured between 40 - 59");
		}else {
			System.out.println("Failed");
			
			if(p==0) {
				System.out.println("Percentage secured 0");
			}
			
			if(p!=0) {
				System.out.println("Percentage secured is not 0");
			}	
		}
	}
}
