public class NumberToWordsChallenge {
    public static void main(String[] args) {
        numberToWords(1000);
    }
    public static void numberToWords(int number) {
        int originalDigitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        do {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reversedNumber /= 10;
        } while (reversedNumber != 0);

        while (originalDigitCount != reversedDigitCount) {
            System.out.println("Zero");
            reversedDigitCount++;
        }

    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10;

            int digit = number % 10;

            reversed += digit;

            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int numberOfDigits = 0;

        do {
            numberOfDigits++;
            number /= 10;
        } while (number != 0);
        return numberOfDigits;
    }
}