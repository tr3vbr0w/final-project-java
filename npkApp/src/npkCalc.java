/*whats up guys, heres my revision of the main class
I've included some notes to elaborate/provide some
insight into what I'm trying to accomplish*/

import java.util.Arrays;
import java.util.Scanner;

//class declaration
public class npkCalc 
{
   public static void main(String[] args) throws Exception
   {
      Scanner input = new Scanner(System.in);
      int x = 1;
      double amt;
      double[] npk = new double[3];
      double[] ratio = new double[3];
   
   
      System.out.println("The NPK Calculator:");
      System.out.println("Use simple soil amendments");
      System.out.println("To mix custom nutrient values");
      System.out.println();
        
        //You need to use straight fertilizers that means 3 different fertilizers.
        //one has n (n-0-0) one has p (0-p-0) one has k(0-0-k)
      System.out.println("Enter the nitrogen (N) value");
      npk[0] = input.nextDouble();
      System.out.println("Enter the phosphorus (P) value");
      npk[1] = input.nextDouble();
      System.out.println("Enter the potassium (K) value");
      npk[2] = input.nextDouble();
        
      System.out.println("Enter desired quantity in lbs");
      amt = input.nextDouble();
      System.out.println("Enter your desired ratio as N P K");
        
      Calculator.calc(ratio, npk);
        
        
        //the idea here is I'm wanting to pass this array to the calculator,
        //which will return an array of values which are the desired npk
        //the calculator object will already contain the preset values for blood,
        //guano, and langbeinite
        
        //the calculation will be simple, in the case of blood meal its ratio[i]/.12
        //.12 being the n value of blood meal
      for(int i = 0; i < 3; i++)
      {
         ratio[i] = input.nextDouble()/100 * amt;
      }
        
      System.out.printf("%s%n", Arrays.toString(ratio));
     
        /*this is going to be a format string containing the output, if we have time
        we could give the user the option to save it to an array list
        System.out.printf("");*/
      
      System.out.println("Enter 0 to quit or 1 to continue");
    
     
      
   }   
   //methods
   
}
