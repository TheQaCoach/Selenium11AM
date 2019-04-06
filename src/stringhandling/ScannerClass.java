package stringhandling;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] arg)
	{
		System.out.println("Please enter your name : ");
		Scanner scan = new Scanner(System.in);
		String val = scan.nextLine();
		System.out.println(val);
	}
	
}
