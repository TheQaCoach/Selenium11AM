package stringhandling;

public class String5 {

	public static void main(String arg[])
	{
		String revValue = "Shaswat tripathi is a good boy";
		
		//boy good a is tripathi Shaswat
		//yob doog a si ihtapirt tawsahS
		
		String[] arr = revValue.split(" ");
		System.out.println(arr.length);
		
		for(int x=arr.length-1;x>=0;x--) {
			System.out.print(arr[x]+ " ");
		}
		System.out.println();
		
		for(int x=revValue.length()-1;x>=0;x--) {
			System.out.print(revValue.charAt(x));
		}
	}
}
