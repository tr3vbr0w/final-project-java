/**
 * Fertilizer
 */
public class Fertilizer {
    //fields
    private int n;
    private int p;
    private int k;
    private String name;
    private int ratio;

    //Constructor
    public Fertilizer(String name, int n, int p, int k) {
        this.name = name;
        this.n = n;
        this.p = p;
        this.k = k;
    };


    //Methods
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
}