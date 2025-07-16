public class isEvenNumberChallenge {
    public static void main(String[] args) {

        int startNumber = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (startNumber <= finishNumber ) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                oddCount ++;
                continue;
            }
            System.out.println(startNumber + " is an even number.");
            evenCount++;

            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println(evenCount + " even numbers have been found");
        System.out.println(oddCount + " odd numbers have been found");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


}
