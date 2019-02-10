package operators;

public class TernaryOperation1 {

	public static void main(String arg[])
	{
		int a = 2;
		int b = 3;
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		String z = (a>b)?"a":"b";
		System.out.println(z);
		
		int v = (a>b)?a:b;
		System.out.println(v);
		
		boolean bl = (a>b)?true:false;
		System.out.println(bl);
		
		
	}
	
}
