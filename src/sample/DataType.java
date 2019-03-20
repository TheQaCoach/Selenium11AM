package sample;


public class DataType {
	public static void main(String arg[]) {         //Data type Declaration and initialization
		
		byte val1 = 120;				 // -128 to 127
		short val2 = 32000;				 // -32,768 to 32,767
		int val3 = 2514544;				 // -2,147,483,648 to 2,147,483, 647
		long val4 = 96587455444l;   	 // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 // we need to suffix l at the end of the value
		float val5 = 8924234923479f;	 // ±3.40282347E+38F // we need to suffix f at the end of the value
		double val6 = -234242342344234d; // ±1.79769313486231570E+308 // we need to suffix f at the end of the value
		char val7 = '$';				 //0 to 65,536 (unsigned)
		boolean val8 = true;			 //true or false
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
	}
}
