package controlflow;

public class ForLoop8_Array1 {
	public static void main(String arg[])
	{
		int val = 8;
		int arr[] = {1,2,5,6,7,8};
		
		int position = 0;
		
		boolean valueFound = false;
		
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==val) {
				valueFound = true;
				position = x;
				break;
			}
		}
		
		if(valueFound==true)
		{
			System.out.println("Value Found at position "+position);
		}else
		{
			System.out.println("Value not Found");
		}
	}
}
