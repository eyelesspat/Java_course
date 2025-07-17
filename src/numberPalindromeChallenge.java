public class numberPalindromeChallenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while (number != 0) {
            reversed = reversed * 10;

            int digit = number % 10;

            reversed += digit;

            number /= 10;
        }

        return original == reversed;
    }
}
