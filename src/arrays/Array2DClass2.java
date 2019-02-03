package arrays;

public class Array2DClass2 {
	public static void main(String arg[])
	{
		int var[][] =  new int[][]{{1,2,3},{1,2,3,4},{1,2,3,4}};
		
		//Prints the value in an array
		System.out.println(var[0][1]+","+var[0][1]+","+var[0][2]);
		System.out.println(var[1][1]+","+var[1][1]+","+var[1][2]+","+var[1][3]);
		System.out.println(var[2][1]+","+var[2][1]+","+var[2][2]+","+var[2][3]);
		
		
		//prints the length of array and and length of row's column
		System.out.println("Length of Arrary : "+var.length);
		System.out.println("Length of Arrary[0] : "+var[0].length);
		System.out.println("Length of Arrary[1] : "+var[1].length);
		System.out.println("Length of Arrary[2] : "+var[2].length);
	
	}
}
