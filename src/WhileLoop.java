public class WhileLoop {
    public static void main(String[] args) {

//        int i = 1;
//        boolean isReady = false;
//        do {
//            if (i > 5) {
//                break;
//            };
//            System.out.println(i);
//            i++;
//            isReady = (i > 0);
//        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
