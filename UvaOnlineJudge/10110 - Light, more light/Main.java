import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem code and name: 10110 - Light, more light
 * Platform: UvaOnlineJudge
 *
 * @author MiguelMartinezArias
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int one = 0;
        int correct = 0;
        boolean b = false;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            one = Integer.parseInt(reader.readLine());
            while (one != 0) {
                correct = 0;
                b = false;
                if (one <= 0) {
                    System.exit(0);
                }
                while (correct < (int) Math.sqrt(one) + 1) {
                    if (Math.pow(correct, 2) == one) {
                        b = true;
                    }
                    correct++;
                }
                System.out.println(b ? "yes" : "no");
                one = Integer.parseInt(reader.readLine());
            }

        } catch (IOException iOException) {
            System.exit(0);
        } catch (NumberFormatException numberFormatException) {
            System.exit(0);
        }
    }
}

