package controlflow;

public class ForLoop7_Pattern2 {
	public static void main(String arg[])
	{
		int c = 5;  // 5 9 12 14 15
		int d = 15;
		int temp = 5;
		for(int x = 1;x<=d;x++) {
			System.out.print("*");
			if(x==temp) {
				System.out.println();
				temp = x + c-1;
				c = c-1; 
			}
		}	
	}
}
