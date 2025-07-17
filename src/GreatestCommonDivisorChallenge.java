public class GreatestCommonDivisorChallenge {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,25));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int smallestNumber = first < second ? first : second;
        int GCD = 1;


        for (int i = 1; i <= smallestNumber; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                GCD = i;
            }
        }
        return GCD;

    }
}