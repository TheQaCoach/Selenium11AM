package controlflow;

public class BreakContinue {

	public static void main(String arg[]) {
		int value = 10;
		for(int x=1;x<=10;x++) {
			if(value%x==0) {
				continue;
			}else {
				System.out.println(x);
			}
		}
	}
}
