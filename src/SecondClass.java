public class SecondClass {
    public static void main(String[] args) {
        displayHighScorePosition("Jim", calculateHighScorePosition(1500));

        displayHighScorePosition("Bob", calculateHighScorePosition(1000));

        displayHighScorePosition("Rob", calculateHighScorePosition(500));

        displayHighScorePosition("Gob", calculateHighScorePosition(100));

        displayHighScorePosition("Pob", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println((String) name + " managed to get into position: " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }

        return result;
    }
}
