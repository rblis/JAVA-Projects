import java.util.Scanner;
import java.text.DecimalFormat;

public class test
{
   public static void main (String[]args)
   {
      Scanner console = new Scanner(System.in);
      DecimalFormat d = new DecimalFormat("0.00");
      
      System.out.print("Please enter how much gas is in the car (Gallons): ");
      double GallonCount = console.nextDouble();
      double MileCount = 0;
      
      System.out.println("All right. Here we go. \n");
      
      while (GallonCount > 0) {
         
         while (GallonCount >= 5) {
         
            System.out.println(d.format(GallonCount) + " gallons remaining.");
            System.out.print("How many miles to travel? ");
            MileCount = console.nextDouble();
            System.out.println();
         
            /*while (MileCount <= 0) {
               System.out.print("That's not a valid mile count! ");
               System.out.print("How many miles to travel? ");
               MileCount = console.nextDouble();
               System.out.println();
            } //end of while*/
         
            GallonCount = GallonCount - MileCount/12;
            
            if (GallonCount < 0) { //if the user enters and obscenely large number
               System.out.print("Out of Fuel!");
               System.exit(0);
            } //end of if
         
         
         } //end of while
         
         System.out.print(d.format(GallonCount) + " gallons remaining. ");
         System.out.println("Time to refuel!");
         System.out.print("How many miles to travel? ");
         MileCount = console.nextDouble();
         System.out.println();
         
         GallonCount = GallonCount - MileCount/12;
        
      } //end of while
      
      System.out.print("Out of Fuel!");
   
   } //end of main
} //end of Auto Maintainence