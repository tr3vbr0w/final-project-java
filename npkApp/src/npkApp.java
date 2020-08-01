import java.util.Scanner;

//class declaration
public class npkApp 
{
 
  //main method
   public static void main(String[] args) throws Exception
   {
   
     //import Scanner
      Scanner input = new Scanner(System.in);
     
      int i = 1;
      while(i > 0)
      {
         System.out.println("The NPK Calculator:");
         System.out.println("Use simple soil amendments");
         System.out.println("To mix fertilizers with custom n-p-k value");
         System.out.println();
         
         /*Instantiate fertilizer objects. One represents our Nitrogen fertilizer.
         It represents a fertilizer with n-p-k value of n-0-0*/
         Fertilizer fert1 = new Fertilizer();
         System.out.println("Enter the nitrogen (N) value you have");
         fert1.setN(input.nextDouble());
         
         /*This one represents a phosphorus fertilzer with an n-p-k value of 
         0-p-0.*/ 
         Fertilizer fert2 = new Fertilizer();
         System.out.println("Enter the phosphorus (P) value you have");
         fert2.setP(input.nextDouble());
         
         /*And this one represents our phosphorus fertilizer. It has an n-p-k of
         0-0-k*/
         Fertilizer fert3 = new Fertilizer();
         System.out.println("Enter the potassium (K) value you have");
         fert3.setK(input.nextDouble());
         
         //Instantiate an object of type Calculator
         Calculator myCalc = new Calculator();
         System.out.println("Enter desired quantity in lbs");
         myCalc.setAmt(input.nextDouble());
         
         //The user enters what they want the n-p-k value of their mixture to be
         System.out.println("Enter the desired n-p-k ratio for your fertilizer: ");
         System.out.println();
             
         System.out.print("Nitrogen value: ");
         myCalc.setNVal(input.nextDouble());
         System.out.print("Phosphorus value: ");
         myCalc.setPVal(input.nextDouble());
         System.out.print("Potassium value: ");
         myCalc.setKVal(input.nextDouble());
         
         //calculate method figures out the mix
         myCalc.calc(fert1.getN(), fert2.getP(), fert3.getK());
         
         //outputting the amount of each simple fertilizer to use in the mix
         System.out.printf("For a mix with n-p-k of %.0f-%.0f-%.0f, blend:%n",
             myCalc.getNVal(),myCalc.getPVal(), myCalc.getKVal());
         System.out.printf("%.2f lbs of nitrogen%n%.2f lbs of phosphorus%n%.2f lbs potassium%n",
             myCalc.NPKresult[0], myCalc.NPKresult[1], myCalc.NPKresult[2]);
      
         //ask user if they are done 
         System.out.println("Enter 0 to quit or 1 to continue");
         i = input.nextInt();
      }  
   }  
}