package type_conversion;

public class Implicit_conversion {
	public static void main(String args[]) {
		int i = 10;
		char c = 10;
		i = i+c;//here character type change into int,as integer is larger.
		System.out.println("int = "+i);
		byte by = 10;
		long lo = 1+19;
		double dou = i*2.5+lo-by;
		System.out.println("byte = "+by);
		System.out.println("long = "+lo);
		System.out.println("after conversion all data into double = " +dou);
		
		//here all conversion happened automatically.
	}
	

}
