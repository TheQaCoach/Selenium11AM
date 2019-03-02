package controlflow;

public class ForLoop9_PrimeNumber {

	public static void main(String[] str) {
		// from 1 - 10
		//int val = 1;
		int count = 0;
		
		for(int num = 1 ;num<=10;num++)
		{
			count = 0;
			for(int x=1;x<=num;x++) {
				if(num%x==0) {
					count++;
				}
			}
			if(count<=2 && num!=1) {
				System.out.println(num+" is a Prime Number");
			}else {
				System.out.println(num+ " is not a Prime Number"+ num);
			}	
		}
		
		
	}
	
}
