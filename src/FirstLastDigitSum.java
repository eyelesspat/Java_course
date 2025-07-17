public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(31246));

    }
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastNumber = number % 10;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            int digit = number % 10;
            firstDigit = digit;

            number /= 10;
        }

        sum = firstDigit + lastNumber;

        return sum;
    }
}
