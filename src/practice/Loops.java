package practice;

public class Loops {
	public static void main(String[] arg)
	{
		boolean isDuplicate = false;
		int arr[] = {5,15,9,12,6,9,15,15};
		
		for(int x=0;x<arr.length;x++) {
			int count=1;

			boolean valExist = false;
			for(int z=0;z<x;z++) {
				if(arr[x]==arr[z])
				{
					valExist = true;
				}
			}
			if(valExist==false)
			{
				for(int y=x+1;y<arr.length;y++) {
					if(arr[x]==arr[y])
					{
						isDuplicate = true;
						count++;
					}
				}
				System.out.println("The count of "+arr[x]+" is : "+count);
			}
		}
		if(isDuplicate==true) {
			System.out.println("Duplicate value exists");
		}
	}
}
