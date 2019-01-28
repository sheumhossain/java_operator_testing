package type_conversion;

public class Explicit_conversion {
	public static void main(String args[]) {
		int i = 10;
		double d ;
		d = (double)i;
		System.out.println("after conversion integer into double = "+d);
		double d1 = 15.25;
		i = (int)d1;
		System.out.println("after conversion double into integer = "+i);
		
	}
}
