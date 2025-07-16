public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(50, 2));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Cannot convert values below 0.";
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        return (hours + "h " + remainderMinutes + "m" + remainderSeconds + "s");
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((seconds < 0) || !(minutes >= 0 && minutes <= 59)) {
            return "Cannot convert values below 0.";
        }
        int minutesToSeconds = minutes * 60;
        int result = (minutesToSeconds + seconds);

        return getDurationString(result);

    }
}
