package arrays;

public class ArrayClass3 {

	public static void main(String arg[])
	{
		// space occupied for 100 int values but used only 5
		
		int[] x = new int[100];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		
		
		System.out.println("Length of array is : "+x.length);
		
	}
	
}
