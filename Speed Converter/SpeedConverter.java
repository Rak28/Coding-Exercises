public class SpeedConverter {

    public static long toMilesPerHour(double kilometresPerHour) {
        long milesPerHour = -1;
        if (kilometresPerHour > 0) {
            milesPerHour = Math.round(kilometresPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometresPerHour + " km/h = " + toMilesPerHour(kilometresPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(10.25);
    }

}
