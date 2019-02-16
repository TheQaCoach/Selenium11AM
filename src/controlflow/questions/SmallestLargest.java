package controlflow.questions;

public class SmallestLargest {

	public static void main(String arg[]) {

		int arr[] = { 10, 3, 30, 45, 20, 98, 65, 24 };

		// Finding the smallest number
		int minValue = 0;
		
		for (int x = 0; x < arr.length - 1; x++) {
			int temp = minValue;
			for(int y = 0; y < arr.length; y++) {
				if(arr[x] < arr[y]) {
					minValue = arr[x];
				}
			}
		}
		
		System.out.println(minValue);
	}
}
