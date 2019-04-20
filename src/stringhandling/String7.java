package stringhandling;

public class String7 {

	public static void main(String ar[]) {
		
		String s1 = new String("ABC");
		System.out.println(s1.hashCode());
		String s2 = new String("ABC");
		System.out.println(s2.hashCode());
		
		if(s1==s2) {
			System.out.println("Object are same");
		}else
		{
			System.out.println("Object are different");
		}
		
	}
	
}
