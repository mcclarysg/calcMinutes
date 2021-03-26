public class Hello {

    public static void main(String[] args) {
        System.out.println(getDurationString(35,45));

    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || (seconds > 59))) {
            return "invalid Value";

        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h" +remainingMinutes + "m " + seconds + "s";

    }
}