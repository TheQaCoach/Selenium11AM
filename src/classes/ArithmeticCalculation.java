package classes;

public class ArithmeticCalculation {

	public static void main(String arg[]) {
		
		int x = 5;
		int y = 10;
		
		add(x, y);
		
		//add(3,6);
		
		int val = add(3,6);
		
		printTable(val);
		
		System.out.println("The Calculated value is "+val);
		
	}
	
	public static int add(int x,int y) {
		int s = x+y;
	
		System.out.println(s);
		//printTable(s);
		return s;
	}
	
	public static void printTable(int tableValue) {
		
		for(int x=1;x<=10;x++) {
			System.out.println(tableValue*x);
		}
	}
}
