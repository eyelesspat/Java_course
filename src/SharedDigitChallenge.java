public class SharedDigitChallenge {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(99, 19));
    }
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        int firstDigitX = x % 10;
        int secondDigitX = (x / 10) % 10;

        while (y != 0) {
            int digitY = y % 10;
            if ((digitY == firstDigitX) || (digitY == secondDigitX)) {
                return true;
            }
            y /= 10;
        }
        return false;
    }
}
