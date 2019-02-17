package controlflow;

public class NestedLoop {

	public static void main(String arg[]) {
		// prime number validation

		int val = 13;
		boolean isPrime = false;

		for (int x = 2; x < val / 2; x++) {

			if (val % x == 0) {
				isPrime = false;
				break;
			}else {
				isPrime = true;
			}
		}
		
		if(isPrime==false) {
			System.out.println("Is not a prime");
		}else {
			System.out.println("Is a prime");
		}
	}

}
