package controlflow.questions;

public class DuplicateNumber {

	public static void main(String arg[]) {
		
		int[] arr = {10,26,80,80,1,32,43,51,66,70};
		
		for(int x=0;x<arr.length-1;x++) {
			System.out.println("Value at array position : ["+x+"] : " +arr[x]);
			System.out.println("Comparing with next values in array");
			for(int y=0;y<arr.length;y++) {
				if(arr[x]==arr[y] && x!=y) {
					System.out.print(arr[y]+",");
					System.out.println("Duplicate");
					break;
				}
			}
			System.out.println("-----------------------");
		}
	}
}
