package stringhandling;

public class Str1 {

	public static void main(String a[]) {
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		String s11 = new String("abc");
		String s12 = new String("abc");
		
		if(s1==s2) {
			System.out.println("Same object");
		}else
		{
			System.out.println("Other object");
		}
		
		
		if(s11==s12) {
			System.out.println("Same object");
		}else
		{
			System.out.println("Other object");
		}
		
		
	}
}
