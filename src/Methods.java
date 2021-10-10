
public class Methods {
    public Methods() {
    }

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void displayHighScorePostion  (String PlayersName, int HighScoreTable){
        System.out.println(PlayersName + "managed to get into position" + HighScoreTable + "On the High Score Table");

     displayHighScorePostion("Oscar",4);
    }

}
