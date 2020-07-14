
public class test {
	public static void main (String[]args)
	   {
	      int x = 1;
	      String description;
	      int y = 1;
	      System.out.println("Number   Aliquot Sum    Perfect or Amicable?");
	      
	      while (x <= 500) {
	         x++;
	         y = aliquotsum(x);
	         
	         if (x == y) {
	            description = "Perfect";
	         }
	         else if ((aliquotsum(x) == y) && (aliquotsum(y) == x)) {
	            description = "Amicable";
	         }
	         else if ((factorial(x-1) + 1) % x == 0) {
	            description = "Prime";
	         }
	         else  {
	            description = "Composite";
	         }
	         if ((description == "Amicable") || (description == "Perfect")) {
	         System.out.print(x + "           " + y);
	         System.out.println("             " + description);
	         }
	      }//end of while
	   }//end of main
	   
	   public static int factorial(int num) {
	      int result = 1;
	      for (int i = 1; i<=num; i++) {
	         result *= i;
	      }//end of for
	      return result;
	   }//end of factorial
	   
	   public static int aliquotsum(int x) {
	      int aliquotsum = 0;
	      for (int y = 1; y < x; y++) {
	         if (x % y == 0) {
	            aliquotsum += y;
	         }//end if
	      }//end for
	      return aliquotsum;
	   }
	}