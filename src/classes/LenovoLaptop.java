package classes;

public class LenovoLaptop {

	public static void main(String arg[]) {
		
		Laptop llap = new Laptop(4);
		llap.RAM = 4;
		llap.brandName="Lenovo";
		
		System.out.println(llap.RAM);
		System.out.println(llap.brandName);
		
		llap.calculate();
		
	}
	
}
