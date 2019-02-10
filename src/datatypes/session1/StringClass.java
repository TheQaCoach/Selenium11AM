package datatypes.session1;

public class StringClass {

	public static void main(String[] args) {
	
		String var = " Hello World ";
		
		System.out.println(var);
		System.out.println(var.length());
		System.out.println(var.charAt(8));
		
		
		//removes spaces from leading and trailing of the string
		String var2 = var.trim();
		
		System.out.println(var2);
		System.out.println(var2.length());
		System.out.println(var2.charAt(8));
		
	}
}
