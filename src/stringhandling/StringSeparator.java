package stringhandling;

public class StringSeparator {

	public static void main(String[] args) {
		String str1 = "Selenium  Java Leaders";
		
		String[] strtemp = str1.split(" ");
		
		for(String s:strtemp) {
			separateString(s);			
		}
		
	}
	
	public static void separateString(String str1) {
		
		String[] ch = str1.split("");
		for(int x=0;x<ch.length;x++) {
			System.out.print(ch[x]);
			if(x==0)
			{
				if(x!=ch.length-1)
				{
					System.out.print("-");
				}
			}else if(x%2==0) {
				if(x!=ch.length-1)
				{
					System.out.print("-");
				}
			}
		}
		System.out.print(" ");
	}
}
