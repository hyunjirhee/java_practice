public class sumOfDigits {
    public static void sumDigits(long n) {
        long quotient = 0;
        long remainder = 0;
        long sumDigit = 0;

        while (quotient != 0) {
            quotient = (int)n/10;
            remainder = n%10;
            n = remainder;

            System.out.println("quotient : " + quotient + ", remainder : " + remainder);
        }
    }

    public static void main(String[] args) {
        long num = 1234;
        sumDigits(num);
    }
}
