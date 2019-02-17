package classes;

public class DellLaptop {

	public static void main(String arg[]) {
		
		Laptop dlap = new Laptop();
		dlap.RAM = 2;
		dlap.brandName="Dell";
		
		
		
		
		System.out.println(dlap.RAM);
		System.out.println(dlap.brandName);
		
		dlap.calculate();
		
	}
	
}
