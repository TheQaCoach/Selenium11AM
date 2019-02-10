package controlflow;

public class ForLoop5_Prime {
	public static void main(String arg[])
	{
		int value = 45;
		
		boolean isPrime=true;
		
		for(int x = 2;x<value/2;x++)
		{
			if(value%x==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime==false)
		{
			System.out.println("Not a prime");
		}else
		{
			System.out.println("Is a prime");
		}
		
	}
}
