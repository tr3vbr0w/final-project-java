public class npkCalc {
    public static void main(String[] args) throws Exception {
        //Create new fertilizer instance
        Fertilizer guano = new Fertilizer("Seabird Guano", 0, 11, 0);

        System.out.printf("\n%s p value: %d", guano.getP());
        System.out.printf("\n%s n value: %d", guano.getN());
        System.out.printf("\n%s k value: %d", guano.getK());
    }
}
