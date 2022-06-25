public class Permutar {
    public static void permutar(int[] conjunto, int p) {
        if (p == 2) {
            System.out.printf(conjunto[1], conjunto[2], conjunto[3]);
        } else {
            do {
                permutar(conjunto, p + 1);
                conjunto[p]++;
            } while (conjunto[p] < 3);
            conjunto[p] = 0;
        }
    }
}
