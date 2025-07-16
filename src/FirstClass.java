public class FirstClass {
    public static void main(String[] args) {
        System.out.println("New player score is " + calculateScore("Tim", 500));
        System.out.println("Another player score is " + calculateScore(10));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Unknown", score);
    }
}
