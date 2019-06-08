import java.util.Arrays;
import java.util.Random;

public class Main {
// LOTTO

    public static void main(String[] args) {

        int[] wyniki = new int[6];
        Random los = new Random();

        do {
            for (int i = 0; i < wyniki.length; i++) {
                wyniki[i] = los.nextInt(49) + 1;
            }
            System.out.println("Wyniki: " + Arrays.toString(wyniki));
        } while (czyJestPowtorzenie(wyniki));
    }

    public static boolean czyJestPowtorzenie(int[] wyniki) {
        for (int i = 0; i < wyniki.length; i++) {
            for (int j = i + 1; j < wyniki.length; j++) {
                if (wyniki[i] == wyniki[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
