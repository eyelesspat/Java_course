public class OverloadedChallenge {

    public static void main(String[] args) {
        double result = convertToCentimeters(5, 8);
        System.out.println("The result is: " + result + " cm");

        double result2 = convertToCentimeters(68);
        System.out.println("The result is: " + result2 + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainderInInches) {
        return convertToCentimeters(((heightInFeet * 12) + remainderInInches));
    }
}
