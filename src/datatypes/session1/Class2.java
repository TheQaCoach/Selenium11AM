package datatypes.session1;

public class Class2 {
	
	static boolean isAvailable;
	static char c;
	static byte by;
	static short sh;
	static int x;
	static long l;
	static float f;
	static double d;
	static String s;
	
	public static void main(String[] args) {
		
		int isAvailable  = 1;
		
		System.out.println(isAvailable);
		System.out.println(c);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(x);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s);
		calculation();
	}
	
	public static void calculation() {
		isAvailable = true;
		System.out.println(isAvailable);
	}
	
}
