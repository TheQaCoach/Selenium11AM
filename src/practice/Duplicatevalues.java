package practice;

public class Duplicatevalues {

	public static void main(String[] args) {
		int[] arr = {5,15,9,12,6,9,15,15};
		
		for(int x=0; x<arr.length-1; x++){
			for (int y=0; y<arr.length ; y++) {
				if (arr[x]==arr[y] && x!=y) {
					System.out.println("YES");
					break;
				}
			}
			
		}
		

	}

}
