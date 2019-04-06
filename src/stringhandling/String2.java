package stringhandling;

public class String2 {

	public static void main(String arg[])
	{
		String text = "Installation will begin shortly";
		
		char c = text.charAt(0);
		
		if(c=='I')
		{
			System.out.println("String begins with I");
		}else
		{
			System.out.println("String does not begin with I");
		}
		
		
		if(text.length()>15)
		{
			System.out.println("Valid text");
		}else
		{
			System.out.println("Invalid text");
		}
				
		
	}
	
}
