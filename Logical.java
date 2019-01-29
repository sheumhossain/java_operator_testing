package operator;

public class Logical {
	public static void main(String args[]) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		System.out.println("b1 & b2 = " +(b1&b2));
		System.out.println("b1 | b2 = " +(b1|b2));
		System.out.println("b1 ^ b2 = " +(b1^b2));
		
		int a = 12, b = 25;
		
		/*
		 * 12 = 00001100 (In Binary)
		   25 = 00011001 (In Binary)

			Bit Operation of 12 and 25
			00001100
		  & 00011001
            ________
  		    00001000  = 8 (In decimal)
		 */
		System.out.println("a & b = " +(a&b));
		
		/*
		 * 12 = 00001100 (In Binary)
			25 = 00011001 (In Binary)

			Bitwise OR Operation of 12 and 25
			00001100
 		   |00011001
  		    ________
            00011101  = 29 (In decimal)
		 */
		System.out.println("a & b = " +(a|b));
		
		/*
		 * 12 = 00001100 (In Binary)
           25 = 00011001 (In Binary)

           Bitwise XOR Operation of 12 and 25
           00001100
          ^00011001
           ________
           00010101  = 21 (In decimal)
		 */
		
		System.out.println("a ^ b = " +(a^b));
	}
}
