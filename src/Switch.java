public class Switch {

    public static void main(String[] args) {

        int value = 5;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was either 3, 4 or 5");
            }
            default -> System.out.println("Was not 1 or 2");
        }

        String month = "JULY";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");

        char letter = 'A';
        System.out.println(letter + " in NATO is: " + getNatoLetter(letter));

        int day = 1;
        printDayOfWeek(day);
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield month + " is bad";
            }
        };
    }

    public static String getNatoLetter(char letter) {
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "This letter is not implemented yet";
        };
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day of the week.";
        };
        System.out.println(dayOfWeek);
    }
}
