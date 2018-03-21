public class BitwiseOperators {
   public static void main(String args[]) {

      int a = 4;/* 4 = 0000 0100 */
      int b = 3;/* 3 = 0000 0011 */
      int c = 0;

      //true if both a and b are true
      c = a & b;        /* 0 = 0000 0000 */
      System.out.println("a & b = " + c );

     //true if any of a or b are true
     c = a | b;        /* 7 = 0000 0111 */
      System.out.println("a | b = " + c );

     // true if only a or b (but not both) are true
     c = a ^ b;        /* 7 = 0011 0111 */
      System.out.println("a ^ b = " + c );

     //inverts the bit pattern
     c = ~a;            /* -5 = 1111 1011*/
     System.out.println("~a = " + c );


   }
}