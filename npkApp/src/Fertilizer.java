/**
 * Fertilizer
 */
public class Fertilizer {
    //fields
    private int n;
    private int p;
    private int k;
    private String name;
    //Insert formula here to define the npk ratio
    private int ratio;
    private int quantity;

    //Constructor
    public Fertilizer(String name, int n, int p, int k, int q) {
        this.name = name;
        this.n = n;
        this.p = p;
        this.k = k;
        this.quantity = q;
    };


    //Methods

    //getRatio will be defined once we have the algebraic equation to do so
    public int getRatio(){
        return this.ratio;
    };
    public int getN(){
        return this.n;
    };
    public int getP(){
        return this.p;
    };
    public int getK(){
        return this.k;
    };
    public String getName(){
        return this.name;
    };
    public int getQuantity(){
        return this.quantity;
    }
}