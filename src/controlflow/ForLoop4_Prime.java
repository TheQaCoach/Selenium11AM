package controlflow;

public class ForLoop4_Prime {
	public static void main(String arg[])
	{
		int value = 13;
		
		int counter = 0;
		
		for(int x=2;x<value/2;x++) { //Since a number cannot be divided by more than half of it. (ignoring itself)
			if(value%x==0)
			{
				counter++;
				break;
			}
		}
		
		if(counter>0) {
			System.out.println("Not a prime");
		}else
		{
			System.out.println("Is a prime");
		}
		
	}
}
