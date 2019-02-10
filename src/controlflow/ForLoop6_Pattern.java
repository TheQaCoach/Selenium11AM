package controlflow;

public class ForLoop6_Pattern {
	public static void main(String arg[])
	{
		for(int a=1;a<=10;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
