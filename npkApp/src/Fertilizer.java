public class Fertilizer {
    //fields
    //these are the values of each of the soil amendments to be mixed
    //n represents a fertilizer with a nutrient ratio of n-0-0, p one with a 
    //ratio of 0-p-0, and k would be 0-0-k.
    private double n = 0;
    private double p = 0;
    private double k = 0;
    private String name;
   //Constructor
    public Fertilizer() {
       setN(n);
       setP(p);
       setK(k);
    };
    //Methods
    public double getN(){
       return this.n;
    };
    public double getP(){
       return this.p;
    };
    public double getK(){
       return this.k;
    };
    public String getName(){
       return this.name;
    };
    //Setter Methods
    public void setN(double n){
       this.n = n/100;
    }
    public void setP(double p){
       this.p = p/100;
    }
    public void setK(double k){
       this.k = k/100;
    }
 };