package controlflow.questions;

public class MissingNumber {

	public static void main(String arg[]) {
		
		int[] arr = {1,2,8,8,10,3,4,5,6,7};
		
		for(int x=1;x<=10;x++) {
			System.out.println("Value : "+x);
			System.out.print("Comparing with value in array : ");
			for(int y=0;y<arr.length;y++) {
				System.out.print(arr[y]+",");
				if(x==arr[y]) {
					System.out.println(" [Value Found]");
					break;
				}
				
			}
			System.out.println("------------------------------------------");
		}
		
	}
	
}
