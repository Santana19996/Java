package methodsAndChallenges;

import java.util.Locale;

public class ArrayTask6 {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
int wins=0;
int losses= 0;
        for (String s : record) {
            if (s.toLowerCase(Locale.ROOT).equals("win")) {
                wins += 1;
            } else if (s.toLowerCase(Locale.ROOT).equals("loss")) {
                losses += 1;
            }
        }
        System.out.println("With a professional record of "+ wins + " wins and " +losses+ " losses.");
    }
}
