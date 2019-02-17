package classes;
public class Laptop {
	
	public Laptop(int RAM) {
		this.RAM = RAM;
	}
	
	public Laptop() {
		
	}
	
	int RAM;
	int HD;
	String brandName;
	String modelName;
	String processorName;
	public void switchOn() {
		System.out.println("Switches on the laptop");
	}
	public void switchOff() {
		System.out.println("Switches off the laptop");
	}
	public void print() {
		System.out.println("Gives instruction to print");
	}
	public void calculate() {
		System.out.println("Calculates the data");
	}
}
