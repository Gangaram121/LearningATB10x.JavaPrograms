package February.ex_07022025;

public class Inverted_Pyramid_Pattern {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {
            int j = rows;
            // Printing spaces
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            // Printing stars
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
