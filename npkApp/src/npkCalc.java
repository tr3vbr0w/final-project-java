public class npkCalc {
    public static void main(String[] args) throws Exception {
        Fertilizer guano = new Fertilizer("Seabird Guano", 0, 11, 0, 4);

        System.out.printf("\nSeabird Guano p value: %d", guano.getP());
    }
}
