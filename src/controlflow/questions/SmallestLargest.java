package controlflow.questions;

public class SmallestLargest {
	public static void main(String arg[]) {
		int arr[] = { 10, 3, 30, 45, 20, 98, 65, 24 };
		int minValue = 0;
		minValue = arr[0];
		for(int x=0;x<arr.length;x++) {
			if(arr[x]<minValue) {
				minValue = arr[x];
			}
		}
		System.out.println(minValue);
		
		
		int maxValue = 0;
		maxValue = arr[0];
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>maxValue) {
				maxValue = arr[x];
			}
		}
		System.out.println(maxValue);
	}
}
