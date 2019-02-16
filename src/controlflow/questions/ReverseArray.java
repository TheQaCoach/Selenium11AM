package controlflow.questions;

public class ReverseArray {

	public static void main(String arg[]) {

		int arr[] = { 10, 3, 30, 45, 20, 98, 65, 24 };
		int arr2[] = new int[arr.length];
			int y = 0;
			for(int x=arr.length-1;x>=0;x--) {
				arr2[y] = arr[x];
				y++;
			}
			for (int x = 0; x < arr.length; x++)
			{
				System.out.println(arr2[x]);
			}
			
			
		}
	
}
