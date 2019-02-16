package controlflow.questions;

public class SortingArray {

	public static void main(String arg[]) {
		int arr[] = {12,2,45,6,2,16};
		int temp = 0;
		for(int x=0;x<arr.length-1;x++) {
			for(int z=0;z<arr.length;z++) {
				System.out.print(arr[z]+",");
			}
			System.out.println();
			for(int y=x+1;y<arr.length;y++) {
				//System.out.print(arr[y]+",");
				if(arr[x]>arr[y]) {
					temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
		for(int z=0;z<arr.length;z++) {
			System.out.print(arr[z]+",");
		}
		
	}
	
}
