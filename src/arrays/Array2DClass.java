package arrays;

public class Array2DClass {
	public static void main(String arg[])
	{
		int var[][] =  new int[3][4];
		
		var[0][0] = 1;
		var[0][1] = 2;
		var[0][2] = 3;
		var[0][3] = 4;
		var[1][0] = 11;
		var[1][1] = 22;
		var[1][2] = 33;
		var[1][3] = 44;
		var[2][0] = 111;
		var[2][1] = 222;
		var[2][2] = 333;
		var[2][3] = 444;
		
		
		System.out.println(var[0][0]+","+var[0][1]+","+var[0][2]+","+var[0][3]);
		System.out.println(var[1][0]+","+var[1][1]+","+var[1][2]+","+var[1][3]);
		System.out.println(var[2][0]+","+var[2][1]+","+var[2][2]+","+var[2][3]);
		
		
		System.out.println("Length of Arrary : "+var.length);
		System.out.println("Length of Arrary : "+var[0].length);
		System.out.println("Length of Arrary : "+var[1].length);
		System.out.println("Length of Arrary : "+var[2].length);
		
		
	}
}
