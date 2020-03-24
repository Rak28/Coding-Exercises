public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Number is 0");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(-3);
    }

}
