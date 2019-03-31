package exceptionhandling;

public class CommonException {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(arr.length);

		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException exp) {
			System.out.println("ArrayIndexOutOfBoundsException was thrown");
		} catch (Exception e) {
			System.out.println("Exception was thrown");
		} finally {
			System.out.println("This will always execute.......");
		}

		System.out.println("Last line of code");

	}

}
