import java.util.ArrayList;

public class Calculator
{
   //this is the desired quantity of mix
   private double amt;
   
   //these are the n-p-k values the user entered and wants the mix to have. 
   private double nVal, pVal, kVal = 0;
   
   /*these are the values returned by the calc() method. they reflect the weight
   of fertilizer that is to be mixed.*/
   private double nLbs, pLbs, kLbs = 0; 

  double[] NPKresult;
   
   //constructor
   public Calculator() 
   {
      setNVal(nVal);
      setPVal(pVal);
      setKVal(kVal);
      
   }
   
   /*The calc method takes the desired value (ie nVal) and divides by 100 to
   reflect the value as what it really is, a percentage. This is then multiplied
   by the desired quantity the user entered (amt) and divided by the nutrient 
   value of the supplied fertilizer.*/



   public double[] calc(double n, double p, double k)
   {
   
      nLbs = (nVal / 100 * amt) / n;
      pLbs = (nVal / 100 * amt) / p;
      kLbs = (nVal / 100 * amt) / k;

      NPKresult = new double[]{nLbs, pLbs, kLbs};
      
      return NPKresult;
   } 
   
   //getters
   public double getNLbs()
   {
      return this.nLbs;
   }
   public double getPLbs()
   {
      return this.pLbs;
   }
   public double getKLbs()
   {
      return this.kLbs;
   }
   public double getNVal()
   {
      return this.nVal;
   }
   public double getPVal()
   {
      return this.pVal;
   }
   public double getKVal()
   {
      return this.kVal;
   }
   
   //setters
   public void setAmt(double amt)
   {
      this.amt = amt;
   } 
   public void setNVal(double nVal)
   {
      this.nVal = nVal;
   }
   public void setPVal(double pVal)
   {
      this.pVal = pVal;
   }
   public void setKVal(double kVal)
   {
      this.kVal = kVal;
   }

  
}