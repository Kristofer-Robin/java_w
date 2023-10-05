package W1;

public class ex5 {
    public static void main(String[] args) {
        // Number of seconds in a minute
        int secondsPerMinute = 60;

        // Number of minutes in an hour
        int minutesPerHour = 60;

        // Number of hours in a day
        int hoursPerDay = 24;

        // Number of days in a non-leap year
        int daysPerYear = 365;

        // Calculate the total number of seconds in a year
        int secondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;

        // Display the result
        System.out.println("There are " + secondsPerYear + " seconds in a year.");
    }
}
