public class Loops {
    public static void main(String[] args) {
        loopExample(0);


        for (double i = 7.5; i <=10.0; i += 0.25) {
            double result = calculateInterest(100.0, i);
            if (result > 8.5) {
                break;
            }
            System.out.println(result);
        }
    }

    public static void loopExample(int num) {
        for ( int i = num; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }
}
